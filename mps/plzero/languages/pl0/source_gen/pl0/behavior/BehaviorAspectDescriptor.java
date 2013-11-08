package pl0.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0b, fqName)) {
      case 3:
        return new IntLiteral_BehaviorDescriptor();
      case 6:
        return new TInteger_BehaviorDescriptor();
      case 4:
        return new Odd_BehaviorDescriptor();
      case 5:
        return new Program_BehaviorDescriptor();
      case 1:
        return new BeginStmt_BehaviorDescriptor();
      case 2:
        return new Block_BehaviorDescriptor();
      case 0:
        return new AssignStmt_BehaviorDescriptor();
      case 7:
        return new VarDef_BehaviorDescriptor();
      case 9:
        return new VarRef_BehaviorDescriptor();
      case 8:
        return new VarDefs_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"pl0.structure.AssignStmt", "pl0.structure.BeginStmt", "pl0.structure.Block", "pl0.structure.IntLiteral", "pl0.structure.Odd", "pl0.structure.Program", "pl0.structure.TInteger", "pl0.structure.VarDef", "pl0.structure.VarDefs", "pl0.structure.VarRef"};
}
