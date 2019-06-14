package com.fancy.network.bean;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class OrderCountBean {

    /**
     * respTime : 1560480466561
     * respCode : 0000
     * respMsg : 接口调用成功
     * data : {"unpaid":0,"undelivered":14,"dispatched":0}
     */

    private long respTime;
    private String respCode;
    private String respMsg;
    private DataBean data;

    public long getRespTime() {
        return respTime;
    }

    public void setRespTime(long respTime) {
        this.respTime = respTime;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * unpaid : 0
         * undelivered : 14
         * dispatched : 0
         */

        private int unpaid;
        private int undelivered;
        private int dispatched;

        public int getUnpaid() {
            return unpaid;
        }

        public void setUnpaid(int unpaid) {
            this.unpaid = unpaid;
        }

        public int getUndelivered() {
            return undelivered;
        }

        public void setUndelivered(int undelivered) {
            this.undelivered = undelivered;
        }

        public int getDispatched() {
            return dispatched;
        }

        public void setDispatched(int dispatched) {
            this.dispatched = dispatched;
        }
    }
}
