package org.drools.chance.constraints.core.connectives.impl.lukas;

import org.drools.chance.constraints.core.connectives.impl.AbstractConnective;
import org.drools.chance.constraints.core.connectives.impl.LOGICCONNECTIVES;
import org.drools.chance.degree.IDegree;

/**
 * Created by IntelliJ IDEA.
 * User: doncat
 * Date: 25/01/11
 * Time: 21.35
 * To change this template use File | Settings | File Templates.
 */
public class Equiv extends AbstractConnective {

    private Equiv() { }

    private static Equiv instance = new Equiv();

    public static Equiv getInstance() {
        return instance;
    }

    public LOGICCONNECTIVES getType() {
        return LOGICCONNECTIVES.EQ;
    }


    public IDegree eval(IDegree deg) {
        throw new UnsupportedOperationException("Logic Equivalence operator is not unary");
    }

    public IDegree eval(IDegree left, IDegree right) {
        return Not.getInstance().eval(Xor.getInstance().eval(left,right));
    }

    public IDegree eval(IDegree... degs) {
        IDegree deg = degs[0];
        for (int j = 1; j < degs.length; j++) {
            deg = this.eval(deg,degs[j]);
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
        return false;
    }
}
