package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public abstract class BaseV7EndlessResponse extends BaseV7Response {
    protected static final int NEXT_STEP = 10;
    private final boolean stableTotal;

    public BaseV7EndlessResponse() {
        this(true);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof BaseV7EndlessResponse;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7EndlessResponse)) {
            return false;
        }
        BaseV7EndlessResponse baseV7EndlessResponse = (BaseV7EndlessResponse) obj;
        return baseV7EndlessResponse.canEqual(this) && super.equals(obj) && this.stableTotal == baseV7EndlessResponse.stableTotal;
    }

    public abstract int getNextSize();

    public abstract int getTotal();

    public abstract boolean hasData();

    public boolean hasStableTotal() {
        return this.stableTotal;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        return ((super.hashCode() + 59) * 59) + (this.stableTotal ? 79 : 97);
    }

    public BaseV7EndlessResponse(boolean z) {
        this.stableTotal = z;
    }
}
