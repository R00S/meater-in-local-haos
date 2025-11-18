package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: MeasurementUnit.java */
/* renamed from: io.sentry.v2 */
/* loaded from: classes2.dex */
public interface InterfaceC9659v2 {

    /* compiled from: MeasurementUnit.java */
    /* renamed from: io.sentry.v2$a */
    public enum a implements InterfaceC9659v2 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.InterfaceC9659v2
        @ApiStatus.Internal
        public /* bridge */ /* synthetic */ String apiName() {
            return C9626u2.m31764a(this);
        }
    }

    @ApiStatus.Internal
    String apiName();

    String name();
}
