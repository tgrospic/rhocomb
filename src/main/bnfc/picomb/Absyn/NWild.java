package picomb.Absyn; // Java Package generated by the BNF Converter.

public class NWild  extends YName {
  public NWild() { }

  public <R,A> R accept(picomb.Absyn.YName.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof picomb.Absyn.NWild) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}