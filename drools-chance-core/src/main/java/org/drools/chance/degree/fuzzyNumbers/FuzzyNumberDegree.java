package org.drools.chance.degree.fuzzyNumbers;

import org.drools.chance.degree.IDegree;
import org.drools.chance.degree.interval.IntervalDegree;
import org.drools.chance.degree.simple.SimpleDegree;


/**
 * TODO
 *
 * Models a (simple) degree using a fuzzy number instead of a double
 *
 * @author doncat
 *
 */
public class FuzzyNumberDegree implements IDegree {

	public IDegree False() {
		// TODO Auto-generated method stub
		return null;
	}

	public IDegree True() {
		// TODO Auto-generated method stub
		return null;
	}

	public IDegree Unknown() {
		// TODO Auto-generated method stub
		return null;
	}

    public IDegree sum(IDegree sum) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IDegree mul(IDegree mul) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IDegree div(IDegree div) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IDegree sub(IDegree sub) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IDegree max(IDegree comp) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IDegree min(IDegree comp) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IDegree fromConst(double number) {
        //TODO
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public IntervalDegree asIntervalDegree() {
		// TODO Auto-generated method stub
		return null;
	}

	public SimpleDegree asSimpleDegree() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getConfidence() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean toBoolean() {
		// TODO Auto-generated method stub
		return false;
	}

	public int compareTo(IDegree o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
