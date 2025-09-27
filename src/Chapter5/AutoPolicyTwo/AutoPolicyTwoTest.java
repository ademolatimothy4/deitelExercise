package Chapter5.AutoPolicyTwo;



public class AutoPolicyTwoTest {
    public static void main(String[] args) {

        AutoPolicyTwo policy1 = new AutoPolicyTwo(11111111, "Toyota Camry", "DR");
        AutoPolicyTwo policy2 = new AutoPolicyTwo(22222222, "Ford Fusion", "ME");


        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicyTwo policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }
}
