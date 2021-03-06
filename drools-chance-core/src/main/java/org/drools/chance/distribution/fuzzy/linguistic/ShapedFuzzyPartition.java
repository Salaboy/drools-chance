package org.drools.chance.distribution.fuzzy.linguistic;

import java.util.*;

import org.drools.chance.degree.IDegree;
import org.drools.chance.degree.simple.SimpleDegree;
import org.drools.chance.distribution.IContinuousPossibilityDistribution;
import org.drools.chance.distribution.IDiscretePossibilityDistribution;
import org.drools.chance.distribution.IPossibilityDistribution;

import de.lab4inf.fuzzy.FuzzyAlphaCutPartition;
import org.drools.chance.utils.ValueSortedMap;

public class ShapedFuzzyPartition<T extends ILinguistic<Number>> implements IDiscretePossibilityDistribution<ILinguistic<Number>> {
	
	private ValueSortedMap<ILinguistic<Number>,IDegree> map;



	public ShapedFuzzyPartition(ILinguistic[] values) {
		map = new ValueSortedMap<ILinguistic<Number>, IDegree>();
		for (ILinguistic l : values) {
			map.put(l,SimpleDegree.FALSE);
		}
	}

    public ShapedFuzzyPartition(Map<? extends ILinguistic,? extends IDegree> elements) {
        this.map = new ValueSortedMap();
        for (ILinguistic ling : elements.keySet()) {
            map.put(ling,elements.get(ling));
        }
    }


    public Map<ILinguistic<Number>, IDegree> getDistribution() {
		return map;
	}

	
	public void reshape(ILinguistic key, IDegree deg) {
		map.put(key, deg);
	}


    public void reshape(String key, IDegree deg) {
		map.put(iterator().next().parse(key), deg);
	}



	public IDegree getDegree(ILinguistic key) {
		return map.get(key);
	}


    public String toString() {
        return "(Fuzzy Ling) : {" + serialize() + "}";
    }

    public String serialize() {
        StringBuilder sb = new StringBuilder();
        Iterator<ILinguistic<Number>> iter = getSupport().iterator();
            while (iter.hasNext()) {
            	ILinguistic elem = iter.next();
                sb.append(elem).append("/").append(getDegree(elem).getValue());
                if (iter.hasNext())
                    sb.append(", ");
            }
        return sb.toString();
    }



	public Set<ILinguistic<Number>> getSupport() {
		return map.keySet();
	}


	public int size() {
		return getSupport().size();
	}


	public Iterator<ILinguistic<Number>> iterator() {
		return getSupport().iterator();
	}



    public Number domainSize() {
        return size();
    }



    public Map<ILinguistic<Number>,IDegree> fuzzify(Number val) {
        ValueSortedMap<ILinguistic<Number>,IDegree> vsmap = new ValueSortedMap<ILinguistic<Number>,IDegree>();
        IDegree master = getDegree(iterator().next());
        for (ILinguistic ling : getSupport()) {
            vsmap.put(ling,master.fromConst(ling.getSet().containment(val.doubleValue())));
        }
        return vsmap;
    }





	
	
	
	
	



    public IContinuousPossibilityDistribution<Number> asInducedPossibilityDistribution() {
        return new LinguisticPossibilityDistribution<Number>(map);
    }
}
