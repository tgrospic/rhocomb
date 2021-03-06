package picomb.Absyn; // Java Package generated by the BNF Converter.

public class YVVar  extends YVar {
  public final String cvar_;
  public YVVar(String p1) { cvar_ = p1; }

  public <R,A> R accept(picomb.Absyn.YVar.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof picomb.Absyn.YVVar) {
      picomb.Absyn.YVVar x = (picomb.Absyn.YVVar)o;
      return this.cvar_.equals(x.cvar_);
    }
    return false;
  }

  public int hashCode() {
    return this.cvar_.hashCode();
  }


}
