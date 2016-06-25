package status;

/**
 * Created by kimmin on 6/25/16.
 */
public enum Status {

    UNREADY(0),
    READY(1),
    RUNNING(2),
    ABORT(3);

    Status(int status){
        this.status = status;
    }

    private int status;

}
