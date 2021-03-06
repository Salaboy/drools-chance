package org.drools.chance.common;

import org.drools.chance.distribution.IDistribution;
import org.drools.chance.distribution.IDistributionStrategies;

/**
 * Created by IntelliJ IDEA.
 * User: davide
 * Date: 2/1/11
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IImperfectField<T> {

    public void setValue(T value);


    public void setValue(T value, boolean update);


    /**
     * Setter. Overrides the previous distribution, if any)
     * @param dist A distribution over a bean's field domain
     */
       public void setValue(IDistribution<T> dist);

    /**
     * Setter
     * @param dist A distribution over a bean's field domain
     * @param update if true, the new distribution dist will be merged with the current distribution, according to
     * this instance's strategies. If false, the new distribution will override the previous one.
     */
       public void setValue(IDistribution<T> dist, boolean update);

    /**
     * Predicate.
     * @return true if the current field has already been set, or is still to be initialized
     */
     public boolean isSet();


    /**
     * Getter
     * @return converts the current distribution to a crisp value (according to the current strategies "toCrispValue").
     * The value returned belongs to the same domain the distribution is defined on (e.g. an IDistribution<String> will
     * return a String when crispified)
     */
       public T getCrisp();


    /**
     * Tries to access a "previous" value of this field. Every "set" operation on the field counts
     * as a step.
     *
     * @param time a non-positive integer value.
     * @return The value the field had before the last #time set operations, if possible.
     * 0 corresponds to the current value.
     * @throws IndexOutOfBoundsException
     */
       public IDistribution<T> getPast(int time) throws IndexOutOfBoundsException;


    /**
     * @return the current distribution for this field
     */
       public IDistribution<T> getCurrent();


    /**
     * Getter
     * @return the current Strategies used to manipulate this field's distribution
     */
       public IDistributionStrategies<T> getStrategies();


    /**
     * updates the current distribution, merging it with the provided one, using the current strategies.
     * Convenience method that calls "setValue" with update set to true
     * @param fieldBit the new distribution to merge with the current one
     */
       public void update(IDistribution<T> fieldBit);

    /**
     * updates the current distribution, by converting the provided value into a (degenerate) distribution
     * and merging it with the current one.
     * (In many cases, this operation could still return a degenerate distribution centered on value)
     * @param value the value to merge with the current distribution
     */
       public void update(T value);
}
