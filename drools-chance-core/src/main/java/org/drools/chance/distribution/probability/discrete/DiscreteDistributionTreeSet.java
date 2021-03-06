package org.drools.chance.distribution.probability.discrete;

import org.drools.chance.degree.IDegree;
import org.drools.chance.degree.ValueDegreePair;
import org.drools.chance.degree.simple.SimpleDegree;
import org.drools.chance.distribution.IDistribution;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;



@Deprecated
public class DiscreteDistributionTreeSet<T> implements IDistribution<T>  {

	private TreeSet<ValueDegreePair<T>> _multipleValue=new TreeSet<ValueDegreePair<T>>();



	public DiscreteDistributionTreeSet() {
		super();
	}

	public DiscreteDistributionTreeSet( Collection<T> values, Collection<IDegree> probabilities) {
		 IDegree[] deg=probabilities.toArray(new IDegree[probabilities.size()]);
		 int i=0;
		for (T value : values){
			_multipleValue.add(new ValueDegreePair<T>(value,deg[i]));
			i++;
		}

	}

	public DiscreteDistributionTreeSet( Collection<ValueDegreePair<T>> pairs ) {
		for (ValueDegreePair<T> vdp : pairs)
			_multipleValue.add(vdp);
	}


	public T getBest(){
		return _multipleValue.first().getValue();
	}



	//TODO : Change internal impl to act as map
	@Deprecated
	public IDegree getDegree(T value) {
		Iterator<ValueDegreePair<T>> iter = _multipleValue.descendingIterator();

		if (_multipleValue.size() == 0) return SimpleDegree.FALSE;

		ValueDegreePair<T> pair = null;
		while (iter.hasNext()) {
			pair = iter.next();
			if (pair.getValue().equals(value))
				return pair.getDegree();
		}

		return null;
	}

    public Number domainSize() {
        return _multipleValue.size();
    }


    public T sample() {
		double p = Math.random();
		double acc = 0.0;
		T result = null;
		Iterator<ValueDegreePair<T>> iter = _multipleValue.descendingIterator();
		while ( acc < p ) {
			ValueDegreePair<T> pair = iter.next();
			result = pair.getValue();
			acc += pair.getDegree().getValue();
		}
		return result;
	}


	public void add(ValueDegreePair<T> pair){
		_multipleValue.add(pair);
	}

	public int size(){
		return _multipleValue.size();
	}





//	public DiscreteDistribution( Vector<ValueDegreePair<T>> elements, boolean copy){
//		 if (copy) {
//			 _multipleValue = new Vector<ValueDegreePair<T>>(elements);
//		 } else {
//			 _multipleValue = elements;
//		 }
//	}
//
//	public DiscreteDistribution( Collection<ValueDegreePair<T>> coll) {
//		_multipleValue = new Vector<ValueDegreePair<T>>(coll);
//	}
//
//	public DiscreteDistribution( Vector<ValueDegreePair<T>> coll) {
//		this(coll, false);
//	}










}
