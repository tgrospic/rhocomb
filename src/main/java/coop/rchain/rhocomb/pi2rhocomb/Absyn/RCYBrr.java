package coop.rchain.rhocomb.pi2rhocomb.Absyn; // Java Package generated by the BNF Converter.

public class RCYBrr  extends RCYComb {
  public final RCYName rcyname_1, rcyname_2;
  public RCYBrr(RCYName p1, RCYName p2) { rcyname_1 = p1; rcyname_2 = p2; }

  public <R,A> R accept(coop.rchain.rhocomb.pi2rhocomb.Absyn.RCYComb.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.rhocomb.pi2rhocomb.Absyn.RCYBrr) {
      coop.rchain.rhocomb.pi2rhocomb.Absyn.RCYBrr x = (coop.rchain.rhocomb.pi2rhocomb.Absyn.RCYBrr)o;
      return this.rcyname_1.equals(x.rcyname_1) && this.rcyname_2.equals(x.rcyname_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.rcyname_1.hashCode())+this.rcyname_2.hashCode();
  }


}
