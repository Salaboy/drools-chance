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
public class Xor extends AbstractConnective {

    private Xor() { }

    private static Xor instance = new Xor();

    public static Xor getInstance() {
        return instance;
    }

    public LOGICCONNECTIVES getType() {
        return LOGICCONNECTIVES.XOR;
    }


    public IDegree eval(IDegree deg) {
        throw new UnsupportedOperationException("Logic X-Or operator is not unary");
    }

    public IDegree eval(IDegree left, IDegree right) {
        return (left.sub(right)).sum(right.sub(left));
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
