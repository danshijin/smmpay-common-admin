package com.smmpay.inter.dto.res;

import java.io.Serializable;

/**
 * Created by tangshulei on 2015/11/6.
 */
public class ReturnDTO implements Serializable{

    private static final long serialVersionUID = 6042238835149095913L;
    private String status = "000000";
    private boolean success = true;
    private String msg;
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	@Override
	public String toString() {
		return "ReturnDTO [status=" + status + ", success=" + success
				+ ", msg=" + msg + ", data=" + data + "]";
	}
    
    
}
