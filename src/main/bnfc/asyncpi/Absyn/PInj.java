package asyncpi.Absyn; // Java Package generated by the BNF Converter.

public class PInj  extends PProc {
  public final PComp pcomp_;
  public PInj(PComp p1) { pcomp_ = p1; }

  public <R,A> R accept(asyncpi.Absyn.PProc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof asyncpi.Absyn.PInj) {
      asyncpi.Absyn.PInj x = (asyncpi.Absyn.PInj)o;
      return this.pcomp_.equals(x.pcomp_);
    }
    return false;
  }

  public int hashCode() {
    return this.pcomp_.hashCode();
  }


}
