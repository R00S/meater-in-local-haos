package cm.aptoide.p092pt.reactions;

import cm.aptoide.p092pt.reactions.data.ReactionType;

/* loaded from: classes.dex */
public class ReactionMapper {

    /* renamed from: cm.aptoide.pt.reactions.ReactionMapper$1 */
    static /* synthetic */ class C41191 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$reactions$data$ReactionType;

        static {
            int[] iArr = new int[ReactionType.values().length];
            $SwitchMap$cm$aptoide$pt$reactions$data$ReactionType = iArr;
            try {
                iArr[ReactionType.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$reactions$data$ReactionType[ReactionType.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int mapReaction(java.lang.String r2) {
        /*
            r2.hashCode()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1117280700: goto L39;
                case 3327858: goto L2e;
                case 3559430: goto L23;
                case 102745729: goto L18;
                case 1330679997: goto Ld;
                default: goto Lb;
            }
        Lb:
            r2 = -1
            goto L43
        Ld:
            java.lang.String r0 = "thumbs_up"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L16
            goto Lb
        L16:
            r2 = 4
            goto L43
        L18:
            java.lang.String r0 = "laugh"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L21
            goto Lb
        L21:
            r2 = 3
            goto L43
        L23:
            java.lang.String r0 = "thug"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2c
            goto Lb
        L2c:
            r2 = 2
            goto L43
        L2e:
            java.lang.String r0 = "love"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L37
            goto Lb
        L37:
            r2 = 1
            goto L43
        L39:
            java.lang.String r0 = "thumbs_down"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L42
            goto Lb
        L42:
            r2 = 0
        L43:
            switch(r2) {
                case 0: goto L57;
                case 1: goto L53;
                case 2: goto L4f;
                case 3: goto L4b;
                case 4: goto L47;
                default: goto L46;
            }
        L46:
            goto L5a
        L47:
            r1 = 2131231296(0x7f080240, float:1.807867E38)
            goto L5a
        L4b:
            r1 = 2131231291(0x7f08023b, float:1.8078659E38)
            goto L5a
        L4f:
            r1 = 2131231294(0x7f08023e, float:1.8078665E38)
            goto L5a
        L53:
            r1 = 2131231292(0x7f08023c, float:1.807866E38)
            goto L5a
        L57:
            r1 = 2131231295(0x7f08023f, float:1.8078667E38)
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.reactions.ReactionMapper.mapReaction(java.lang.String):int");
    }

    public static String mapUserReaction(ReactionType reactionType) {
        int i2 = C41191.$SwitchMap$cm$aptoide$pt$reactions$data$ReactionType[reactionType.ordinal()];
        return i2 != 1 ? i2 != 2 ? reactionType.toString().toLowerCase() : "thumbs_down" : "thumbs_up";
    }
}
