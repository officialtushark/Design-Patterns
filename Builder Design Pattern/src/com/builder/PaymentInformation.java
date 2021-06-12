package com.builder;

public class PaymentInformation {
    private Double amount;
    private String sender;
    private String receiver;
    private String remarks;
    private String senderLocation;
    private String ifscCodeOrigin;

    @Override
    public String toString(){
        return "PaymentInformation[amount: "+amount+", sender: "+sender+", receiver: "+receiver+", remarks: "+remarks
                +", senderLocation: "+senderLocation+", ifscCodeOrigin: "+ifscCodeOrigin+"]";
    }

    private PaymentInformation(PaymentInformationBuilder builder){
        this.amount= builder.amount;
        this.sender= builder.sender;
        this.receiver= builder.receiver;
        this.remarks= builder.remarks;
        this.senderLocation= builder.senderLocation;
        this.ifscCodeOrigin= builder.ifscCodeOrigin;
    }

    public static class PaymentInformationBuilder {
        private Double amount;
        private String sender;
        private String receiver;
        private String remarks;
        private String senderLocation;
        private String ifscCodeOrigin;

        PaymentInformationBuilder(Double amount,String sender,String receiver){
            this.amount=amount;
            this.sender=sender;
            this.receiver=receiver;
        }

        public PaymentInformationBuilder remarks(String remarks){
            this.remarks=remarks;
            return this;
        }

        public PaymentInformationBuilder senderLocation(String senderLocation){
            this.senderLocation=senderLocation;
            return this;
        }

        public PaymentInformationBuilder ifscCodeOrigin(String ifscCodeOrigin){
            this.ifscCodeOrigin=ifscCodeOrigin;
            return this;
        }

        public PaymentInformation build(){
            return new PaymentInformation(this);
        }
    }
}
