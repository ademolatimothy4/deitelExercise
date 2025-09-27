package Chapter5.AutoPolicyTwo;

public class AutoPolicyTwo {
        private int accountNumber;
        private String makeAndModel;
        private String state;


        public AutoPolicyTwo(int accountNumber, String makeAndModel, String state) {
            this.accountNumber = accountNumber;
            this.makeAndModel = makeAndModel;
            this.state = state;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setMakeAndModel(String makeAndModel) {
            this.makeAndModel = makeAndModel;
        }

        public String getMakeAndModel() {
            return makeAndModel;
        }

        public void setState(String state) {
            if (state=="CT" || state=="ME" || state=="MA" || state=="NH" || state=="NJ"||state=="NY" || state=="PA"|| state=="VT"){
            this.state = state;
            }
            else {
                System.err.println("Invalid state code");
            }
        }

        public String getState() {
            return state;
        }

        public boolean isNoFaultState() {
            boolean noFaultState;

            switch (getState()) {
                case "MA": case "NJ": case "NY": case "PA":
                    noFaultState = true;
                    break;
                default:
                    noFaultState = false;
                    break;
            }
            return noFaultState;
        }
    }




