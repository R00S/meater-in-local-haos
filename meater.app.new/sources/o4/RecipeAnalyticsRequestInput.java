package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: RecipeAnalyticsRequestInput.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0019\"\u0004\b(\u0010)R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010'\u001a\u0004\b5\u0010\u0019\"\u0004\b8\u0010)R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b2\u0010\u0019\"\u0004\b9\u0010)R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010'\u001a\u0004\b*\u0010\u0019\"\u0004\b;\u0010)R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010!\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010!\u001a\u0004\b>\u0010#\"\u0004\b?\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010!\u001a\u0004\b:\u0010#\"\u0004\bA\u0010%R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010!\u001a\u0004\b@\u0010#\"\u0004\bC\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010!\u001a\u0004\bD\u0010#\"\u0004\bE\u0010%R$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010'\u001a\u0004\bB\u0010\u0019\"\u0004\bF\u0010)R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b/\u0010\u0019\"\u0004\bG\u0010)R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010'\u001a\u0004\b \u0010\u0019\"\u0004\bH\u0010)¨\u0006I"}, d2 = {"Lo4/q;", "", "", "recipeId", "", "cookId", "ongoingRecipeId", "estimatedDuration", "numberOfSteps", "stepOrder", "stepKey", "location", "locale", "deviceId", "productNumber", "targetTemp", "peakTemp", "recommendedTemperature", "stepEstimatedDuration", "startedAt", "finishedAt", "cancelledAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "l", "()Ljava/lang/Integer;", "D", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "c", "i", "A", "d", "v", "e", "h", "z", "f", "q", "I", "g", "p", "H", "y", "x", "j", "u", "k", "C", "r", "J", "m", "B", "n", "E", "o", "G", "F", "w", "s", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.q, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class RecipeAnalyticsRequestInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer recipeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String cookId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String ongoingRecipeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer estimatedDuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer numberOfSteps;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer stepOrder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String stepKey;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String location;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String locale;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String deviceId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer productNumber;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer targetTemp;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer peakTemp;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer recommendedTemperature;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer stepEstimatedDuration;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private String startedAt;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private String finishedAt;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private String cancelledAt;

    public RecipeAnalyticsRequestInput() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final void A(String str) {
        this.ongoingRecipeId = str;
    }

    public final void B(Integer num) {
        this.peakTemp = num;
    }

    public final void C(Integer num) {
        this.productNumber = num;
    }

    public final void D(Integer num) {
        this.recipeId = num;
    }

    public final void E(Integer num) {
        this.recommendedTemperature = num;
    }

    public final void F(String str) {
        this.startedAt = str;
    }

    public final void G(Integer num) {
        this.stepEstimatedDuration = num;
    }

    public final void H(String str) {
        this.stepKey = str;
    }

    public final void I(Integer num) {
        this.stepOrder = num;
    }

    public final void J(Integer num) {
        this.targetTemp = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getCancelledAt() {
        return this.cancelledAt;
    }

    /* renamed from: b, reason: from getter */
    public final String getCookId() {
        return this.cookId;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getEstimatedDuration() {
        return this.estimatedDuration;
    }

    /* renamed from: e, reason: from getter */
    public final String getFinishedAt() {
        return this.finishedAt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeAnalyticsRequestInput)) {
            return false;
        }
        RecipeAnalyticsRequestInput recipeAnalyticsRequestInput = (RecipeAnalyticsRequestInput) other;
        return C3862t.b(this.recipeId, recipeAnalyticsRequestInput.recipeId) && C3862t.b(this.cookId, recipeAnalyticsRequestInput.cookId) && C3862t.b(this.ongoingRecipeId, recipeAnalyticsRequestInput.ongoingRecipeId) && C3862t.b(this.estimatedDuration, recipeAnalyticsRequestInput.estimatedDuration) && C3862t.b(this.numberOfSteps, recipeAnalyticsRequestInput.numberOfSteps) && C3862t.b(this.stepOrder, recipeAnalyticsRequestInput.stepOrder) && C3862t.b(this.stepKey, recipeAnalyticsRequestInput.stepKey) && C3862t.b(this.location, recipeAnalyticsRequestInput.location) && C3862t.b(this.locale, recipeAnalyticsRequestInput.locale) && C3862t.b(this.deviceId, recipeAnalyticsRequestInput.deviceId) && C3862t.b(this.productNumber, recipeAnalyticsRequestInput.productNumber) && C3862t.b(this.targetTemp, recipeAnalyticsRequestInput.targetTemp) && C3862t.b(this.peakTemp, recipeAnalyticsRequestInput.peakTemp) && C3862t.b(this.recommendedTemperature, recipeAnalyticsRequestInput.recommendedTemperature) && C3862t.b(this.stepEstimatedDuration, recipeAnalyticsRequestInput.stepEstimatedDuration) && C3862t.b(this.startedAt, recipeAnalyticsRequestInput.startedAt) && C3862t.b(this.finishedAt, recipeAnalyticsRequestInput.finishedAt) && C3862t.b(this.cancelledAt, recipeAnalyticsRequestInput.cancelledAt);
    }

    /* renamed from: f, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: g, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getNumberOfSteps() {
        return this.numberOfSteps;
    }

    public int hashCode() {
        Integer num = this.recipeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cookId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ongoingRecipeId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.estimatedDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.numberOfSteps;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.stepOrder;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.stepKey;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.location;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locale;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.productNumber;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.targetTemp;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.peakTemp;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.recommendedTemperature;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.stepEstimatedDuration;
        int iHashCode15 = (iHashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str7 = this.startedAt;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.finishedAt;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cancelledAt;
        return iHashCode17 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getOngoingRecipeId() {
        return this.ongoingRecipeId;
    }

    /* renamed from: j, reason: from getter */
    public final Integer getPeakTemp() {
        return this.peakTemp;
    }

    /* renamed from: k, reason: from getter */
    public final Integer getProductNumber() {
        return this.productNumber;
    }

    /* renamed from: l, reason: from getter */
    public final Integer getRecipeId() {
        return this.recipeId;
    }

    /* renamed from: m, reason: from getter */
    public final Integer getRecommendedTemperature() {
        return this.recommendedTemperature;
    }

    /* renamed from: n, reason: from getter */
    public final String getStartedAt() {
        return this.startedAt;
    }

    /* renamed from: o, reason: from getter */
    public final Integer getStepEstimatedDuration() {
        return this.stepEstimatedDuration;
    }

    /* renamed from: p, reason: from getter */
    public final String getStepKey() {
        return this.stepKey;
    }

    /* renamed from: q, reason: from getter */
    public final Integer getStepOrder() {
        return this.stepOrder;
    }

    /* renamed from: r, reason: from getter */
    public final Integer getTargetTemp() {
        return this.targetTemp;
    }

    public final void s(String str) {
        this.cancelledAt = str;
    }

    public final void t(String str) {
        this.cookId = str;
    }

    public String toString() {
        return "RecipeAnalyticsRequestInput(recipeId=" + this.recipeId + ", cookId=" + this.cookId + ", ongoingRecipeId=" + this.ongoingRecipeId + ", estimatedDuration=" + this.estimatedDuration + ", numberOfSteps=" + this.numberOfSteps + ", stepOrder=" + this.stepOrder + ", stepKey=" + this.stepKey + ", location=" + this.location + ", locale=" + this.locale + ", deviceId=" + this.deviceId + ", productNumber=" + this.productNumber + ", targetTemp=" + this.targetTemp + ", peakTemp=" + this.peakTemp + ", recommendedTemperature=" + this.recommendedTemperature + ", stepEstimatedDuration=" + this.stepEstimatedDuration + ", startedAt=" + this.startedAt + ", finishedAt=" + this.finishedAt + ", cancelledAt=" + this.cancelledAt + ")";
    }

    public final void u(String str) {
        this.deviceId = str;
    }

    public final void v(Integer num) {
        this.estimatedDuration = num;
    }

    public final void w(String str) {
        this.finishedAt = str;
    }

    public final void x(String str) {
        this.locale = str;
    }

    public final void y(String str) {
        this.location = str;
    }

    public final void z(Integer num) {
        this.numberOfSteps = num;
    }

    public RecipeAnalyticsRequestInput(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, String str4, String str5, String str6, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str7, String str8, String str9) {
        this.recipeId = num;
        this.cookId = str;
        this.ongoingRecipeId = str2;
        this.estimatedDuration = num2;
        this.numberOfSteps = num3;
        this.stepOrder = num4;
        this.stepKey = str3;
        this.location = str4;
        this.locale = str5;
        this.deviceId = str6;
        this.productNumber = num5;
        this.targetTemp = num6;
        this.peakTemp = num7;
        this.recommendedTemperature = num8;
        this.stepEstimatedDuration = num9;
        this.startedAt = str7;
        this.finishedAt = str8;
        this.cancelledAt = str9;
    }

    public /* synthetic */ RecipeAnalyticsRequestInput(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, String str4, String str5, String str6, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str7, String str8, String str9, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, (i10 & 32) != 0 ? null : num4, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : num5, (i10 & 2048) != 0 ? null : num6, (i10 & 4096) != 0 ? null : num7, (i10 & 8192) != 0 ? null : num8, (i10 & 16384) != 0 ? null : num9, (i10 & 32768) != 0 ? null : str7, (i10 & 65536) != 0 ? null : str8, (i10 & 131072) != 0 ? null : str9);
    }
}
