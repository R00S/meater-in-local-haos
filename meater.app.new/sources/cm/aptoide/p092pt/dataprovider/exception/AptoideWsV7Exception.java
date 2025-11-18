package cm.aptoide.p092pt.dataprovider.exception;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.utils.BaseException;

/* loaded from: classes.dex */
public class AptoideWsV7Exception extends BaseException {
    private BaseV7Response baseResponse;

    public AptoideWsV7Exception(Throwable th) {
        super(th);
    }

    public BaseV7Response getBaseResponse() {
        return this.baseResponse;
    }

    public void setBaseResponse(BaseV7Response baseV7Response) {
        this.baseResponse = baseV7Response;
    }

    public AptoideWsV7Exception() {
    }
}
