package coop.rchain.rhocomb.pi2rhocomb.Absyn; // Java Package generated by the BNF Converter.

public class RCRFwd  extends RCRComb {
  public final RCRName rcrname_1, rcrname_2;
  public RCRFwd(RCRName p1, RCRName p2) { rcrname_1 = p1; rcrname_2 = p2; }

  public <R,A> R accept(coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRComb.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRFwd) {
      coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRFwd x = (coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRFwd)o;
      return this.rcrname_1.equals(x.rcrname_1) && this.rcrname_2.equals(x.rcrname_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.rcrname_1.hashCode())+this.rcrname_2.hashCode();
  }


}