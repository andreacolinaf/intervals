package usantatecla.objectfactory;

import usantatecla.Interval;

public interface IntervalObjectFactory {
    Interval getSmallerIntersectedInterval(Interval interval);
    Interval getGreaterIntersectedInterval(Interval interval);
    Interval getSmallerContainedInterval(Interval interval);
    Interval getGreaterContainedInterval(Interval interval);
    Interval getSmallerNotIntersectedInterval(Interval interval);
    Interval getGreaterNotIntersectedInterval(Interval interval);
}
