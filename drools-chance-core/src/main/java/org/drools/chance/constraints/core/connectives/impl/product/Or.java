package org.drools.chance.constraints.core.connectives.impl.product;

import org.drools.chance.constraints.core.IConstraintCore;
import org.drools.chance.constraints.core.connectives.impl.AbstractConnective;
import org.drools.chance.constraints.core.connectives.impl.LOGICCONNECTIVES;
import org.drools.chance.constraints.core.connectives.impl.lukas.Not;
import org.drools.chance.degree.IDegree;

/**
 * Created by IntelliJ IDEA.
 * User: doncat
 * Date: 25/01/11
 * Time: 21.33
 * To change this template use File | Settings | File Templates.
 */
public class Or extends AbstractConnective {

    private Or() { }

    private static Or instance = new Or();

    public static Or getInstance() {
        return instance;
    }




    public LOGICCONNECTIVES getType() {
        return LOGICCONNECTIVES.OR;
    }





    public IDegree eval(IDegree deg) {
        return deg;
    }


    public IDegree eval(IDegree left, IDegree right) {
        Not neg = Not.getInstance();
        return neg.eval(neg.eval(left).mul(neg.eval(right)));
    }


    public IDegree eval(IDegree... degs) {
        IDegree deg = degs[0];
        for (int j = 1; j < degs.length; j++) {
            deg = eval(deg, degs[j]);
        }
        return deg;
    }



    public boolean isUnary() {
        return false;
    }

    public boolean isBinary() {
        return true;
    }

    public boolean isNary() {
        return true;
    }
}
