package ${package}.common;

public class ResultModel {

    private Integer status;

    private String extra;

    private Object data;

    public ResultModel(Integer status, String extra, Object data) {
        this.status = status;
        this.extra = extra;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultModel SUCCESS(Object data) {
        return new ResultModel(ApiStatusCode.STATUS_200_OK.getStatusCode(),
                              ApiStatusCode.STATUS_200_OK.getDescription(), data);
    }

    public static ResultModel SUCCESS(String extra, Object data) {
        return new ResultModel(ApiStatusCode.STATUS_200_OK.getStatusCode(),
                extra, data);
    }

    public static ResultModel ERROR(ApiStatusCode status) {
        return new ResultModel(status.getStatusCode(), status.getDescription(), null);
    }

    public static ResultModel ERROR(ApiStatusCode status, String data) {
        return new ResultModel(status.getStatusCode(), status.getDescription(), data);
    }
}
