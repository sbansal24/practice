package DesignPatterns.Builder;

public class Fund {
    private int fundId;
    private String fundName;
    private String fundType;

    private Fund(FundBuilder fundBuilder) {
        this.fundId = fundBuilder.fundId;
        this.fundName = fundBuilder.fundName;
        this.fundType = fundBuilder.fundType;
    }

    public int getFundId() {
        return fundId;
    }

    public String getFundName() {
        return fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public static class FundBuilder{
        private int fundId;
        private String fundName;
        private String fundType;

        public FundBuilder fundId(int fundId){
            this.fundId = fundId;
            return this;
        }

        public FundBuilder fundName(String fundName){
            this.fundName = fundName;
            return this;
        }

        public FundBuilder fundType(String fundType){
            this.fundType = fundType;
            return this;
        }

        public Fund build(){
            return new Fund(this);
        }

        public FundBuilder copy(Fund that){
            this.fundId = that.fundId;
            this.fundName = that.fundName;
            this.fundType = that.fundType;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Fund{" +
                "fundId=" + fundId +
                ", fundName='" + fundName + '\'' +
                ", fundType='" + fundType + '\'' +
                '}';
    }
}
