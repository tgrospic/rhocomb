package coop.rchain.rhocomb.pi2rhocomb.Absyn; // Java Package generated by the BNF Converter.

public class RCRQuot  extends RCRName {
  public final RCRProc rcrproc_;
  public RCRQuot(RCRProc p1) { rcrproc_ = p1; }

  public <R,A> R accept(coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRName.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRQuot) {
      coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRQuot x = (coop.rchain.rhocomb.pi2rhocomb.Absyn.RCRQuot)o;
      return this.rcrproc_.equals(x.rcrproc_);
    }
    return false;
  }

  public int hashCode() {
    return this.rcrproc_.hashCode();
  }


}
