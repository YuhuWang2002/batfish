package org.batfish.datamodel.routing_policy.expr;

import org.batfish.datamodel.routing_policy.Environment;
import org.batfish.datamodel.routing_policy.Result;

public class MatchMetric extends AbstractBooleanExpr {

   /**
    *
    */
   private static final long serialVersionUID = 1L;

   private IntComparator _comparator;

   private IntExpr _metric;

   public MatchMetric(IntComparator comparator, IntExpr metric) {
      _comparator = comparator;
      _metric = metric;
   }

   @Override
   public Result evaluate(Environment environment) {
      throw new UnsupportedOperationException(
            "no implementation for generated method"); // TODO Auto-generated
                                                       // method stub
   }

   public IntComparator getComparator() {
      return _comparator;
   }

   public IntExpr getMetric() {
      return _metric;
   }

   public void setComparator(IntComparator comparator) {
      _comparator = comparator;
   }

   public void setMetric(IntExpr metric) {
      _metric = metric;
   }

}