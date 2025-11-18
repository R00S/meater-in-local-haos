package cm.aptoide.p092pt.bonus;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: BonusAppcResponse.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/bonus/BonusAppcResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "result", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/bonus/BonusAppcResponse$Result;", "status", HttpUrl.FRAGMENT_ENCODE_SET, "update_date", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getUpdate_date", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Result", "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BonusAppcResponse {
    private final List<Result> result;
    private final String status;
    private final String update_date;

    /* compiled from: BonusAppcResponse.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m32267d2 = {"Lcm/aptoide/pt/bonus/BonusAppcResponse$Result;", HttpUrl.FRAGMENT_ENCODE_SET, "amount", HttpUrl.FRAGMENT_ENCODE_SET, "bonus", "level", "(III)V", "getAmount", "()I", "getBonus", "getLevel", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Result {
        private final int amount;
        private final int bonus;
        private final int level;

        public Result() {
            this(0, 0, 0, 7, null);
        }

        public Result(int i2, int i3, int i4) {
            this.amount = i2;
            this.bonus = i3;
            this.level = i4;
        }

        public static /* synthetic */ Result copy$default(Result result, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i2 = result.amount;
            }
            if ((i5 & 2) != 0) {
                i3 = result.bonus;
            }
            if ((i5 & 4) != 0) {
                i4 = result.level;
            }
            return result.copy(i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBonus() {
            return this.bonus;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLevel() {
            return this.level;
        }

        public final Result copy(int amount, int bonus, int level) {
            return new Result(amount, bonus, level);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.amount == result.amount && this.bonus == result.bonus && this.level == result.level;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final int getBonus() {
            return this.bonus;
        }

        public final int getLevel() {
            return this.level;
        }

        public int hashCode() {
            return (((this.amount * 31) + this.bonus) * 31) + this.level;
        }

        public String toString() {
            return "Result(amount=" + this.amount + ", bonus=" + this.bonus + ", level=" + this.level + ')';
        }

        public /* synthetic */ Result(int i2, int i3, int i4, int i5, C9789g c9789g) {
            this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4);
        }
    }

    public BonusAppcResponse() {
        this(null, null, null, 7, null);
    }

    public BonusAppcResponse(List<Result> list, String str, String str2) {
        C9801m.m32346f(list, "result");
        this.result = list;
        this.status = str;
        this.update_date = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BonusAppcResponse copy$default(BonusAppcResponse bonusAppcResponse, List list, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bonusAppcResponse.result;
        }
        if ((i2 & 2) != 0) {
            str = bonusAppcResponse.status;
        }
        if ((i2 & 4) != 0) {
            str2 = bonusAppcResponse.update_date;
        }
        return bonusAppcResponse.copy(list, str, str2);
    }

    public final List<Result> component1() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUpdate_date() {
        return this.update_date;
    }

    public final BonusAppcResponse copy(List<Result> result, String status, String update_date) {
        C9801m.m32346f(result, "result");
        return new BonusAppcResponse(result, status, update_date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusAppcResponse)) {
            return false;
        }
        BonusAppcResponse bonusAppcResponse = (BonusAppcResponse) other;
        return C9801m.m32341a(this.result, bonusAppcResponse.result) && C9801m.m32341a(this.status, bonusAppcResponse.status) && C9801m.m32341a(this.update_date, bonusAppcResponse.update_date);
    }

    public final List<Result> getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdate_date() {
        return this.update_date;
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.update_date;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BonusAppcResponse(result=" + this.result + ", status=" + this.status + ", update_date=" + this.update_date + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BonusAppcResponse(List list, String str, String str2, int i2, C9789g c9789g) {
        if ((i2 & 1) != 0) {
            list = Collections.emptyList();
            C9801m.m32345e(list, "emptyList()");
        }
        this(list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }
}
