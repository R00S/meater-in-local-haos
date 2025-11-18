package com.liulishuo.filedownloader.message;

import p241e.p307h.p308a.p315k0.C9036f;

/* loaded from: classes2.dex */
public interface BlockCompleteMessage {

    public static class BlockCompleteMessageImpl extends MessageSnapshot implements BlockCompleteMessage {

        /* renamed from: h */
        private final MessageSnapshot f32977h;

        public BlockCompleteMessageImpl(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.m27531e());
            if (messageSnapshot.mo27519k() != -3) {
                throw new IllegalArgumentException(C9036f.m29009o("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.m27531e()), Byte.valueOf(messageSnapshot.mo27519k())));
            }
            this.f32977h = messageSnapshot;
        }

        @Override // com.liulishuo.filedownloader.message.BlockCompleteMessage
        /* renamed from: b */
        public MessageSnapshot mo27518b() {
            return this.f32977h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 4;
        }
    }

    /* renamed from: b */
    MessageSnapshot mo27518b();
}
