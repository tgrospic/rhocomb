package picomb.Absyn; // Java Package generated by the BNF Converter.

public class YPar  extends YProc {
  public final YProc yproc_1, yproc_2;
  public YPar(YProc p1, YProc p2) { yproc_1 = p1; yproc_2 = p2; }

  public <R,A> R accept(picomb.Absyn.YProc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof picomb.Absyn.YPar) {
      picomb.Absyn.YPar x = (picomb.Absyn.YPar)o;
      return this.yproc_1.equals(x.yproc_1) && this.yproc_2.equals(x.yproc_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.yproc_1.hashCode())+this.yproc_2.hashCode();
  }


}
