package com.ab.design.behavioralpatterns.chainofresponsibility;

public class WorkflowApprovalCORDemo {
    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(RequestType.CONFERENCE, 100);

        director.handleRequest(request1);

        Request request2 = new Request(RequestType.PURCHASE, 1200);

        director.handleRequest(request2);

        Request request3 = new Request(RequestType.PURCHASE, 1600);

        director.handleRequest(request3);
    }
}
