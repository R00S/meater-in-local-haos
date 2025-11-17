package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class MEATEREvent extends Message<MEATEREvent, Builder> {
    public static final ProtoAdapter<MEATEREvent> ADAPTER = new ProtoAdapter_MEATEREvent();
    public static final Integer DEFAULT_TIME = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AlertFiredEvent#ADAPTER", tag = 13)
    public final AlertFiredEvent alertFiredEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AppActionMessage#ADAPTER", tag = 19)
    public final AppActionMessage appActionMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AppBackgroundStateChange#ADAPTER", tag = 14)
    public final AppBackgroundStateChange appBackgroundStateChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionEvent#ADAPTER", tag = 10)
    public final BLEProbeConnectionEvent bleProbeConnectionEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookEstimatorLogRecording#ADAPTER", tag = 8)
    public final CookEstimatorLogRecording cookEstimatorLogRecording;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERDeviceTemperatureRecording#ADAPTER", tag = 21)
    public final MEATERDeviceTemperatureRecording deviceTemperatureRecording;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERErrorEvent#ADAPTER", tag = 15)
    public final MEATERErrorEvent error;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERBlockBLERSSIChange#ADAPTER", tag = 20)
    public final MEATERBlockBLERSSIChange meaterBlockBLERSSIChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERCloudStateChange#ADAPTER", tag = 5)
    public final MEATERCloudStateChange meaterCloudStateChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionEvent#ADAPTER", tag = 9)
    public final MEATERLinkClientSubscriptionEvent meaterLinkClientSubscriptionEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERLinkStateChange#ADAPTER", tag = 4)
    public final MEATERLinkStateChange meaterLinkStateChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERPlusBatteryLevelChange#ADAPTER", tag = 17)
    public final MEATERPlusBatteryLevelChange meaterPlusBatteryLevelChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERPlusProbeConnectionEvent#ADAPTER", tag = 18)
    public final MEATERPlusProbeConnectionEvent meaterPlusProbeConnectionEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERPlusRSSIChange#ADAPTER", tag = 16)
    public final MEATERPlusRSSIChange meaterPlusRSSIChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.NetworkConnectivityStateChange#ADAPTER", tag = 3)
    public final NetworkConnectivityStateChange networkConnectivityStateChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeBatteryLevelChange#ADAPTER", tag = 7)
    public final ProbeBatteryLevelChange probeBatteryLevelChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeRSSIChange#ADAPTER", tag = 6)
    public final ProbeRSSIChange probeRSSIChange;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeReadCookSetupEvent#ADAPTER", tag = 11)
    public final ProbeReadCookSetupEvent probeReadCookSetupEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeReadTempLogEvent#ADAPTER", tag = 12)
    public final ProbeReadTempLogEvent probeReadTempLogEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERDeviceReset#ADAPTER", tag = 22)
    public final MEATERDeviceReset probeReset;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeWriteCookSetupEvent#ADAPTER", tag = 23)
    public final ProbeWriteCookSetupEvent probeWriteCookSetupEvent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.BLERadioStateChange#ADAPTER", tag = 2)
    public final BLERadioStateChange radioStateChange;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer time;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATEREvent, Builder> {
        public AlertFiredEvent alertFiredEvent;
        public AppActionMessage appActionMessage;
        public AppBackgroundStateChange appBackgroundStateChange;
        public BLEProbeConnectionEvent bleProbeConnectionEvent;
        public CookEstimatorLogRecording cookEstimatorLogRecording;
        public MEATERDeviceTemperatureRecording deviceTemperatureRecording;
        public MEATERErrorEvent error;
        public MEATERBlockBLERSSIChange meaterBlockBLERSSIChange;
        public MEATERCloudStateChange meaterCloudStateChange;
        public MEATERLinkClientSubscriptionEvent meaterLinkClientSubscriptionEvent;
        public MEATERLinkStateChange meaterLinkStateChange;
        public MEATERPlusBatteryLevelChange meaterPlusBatteryLevelChange;
        public MEATERPlusProbeConnectionEvent meaterPlusProbeConnectionEvent;
        public MEATERPlusRSSIChange meaterPlusRSSIChange;
        public NetworkConnectivityStateChange networkConnectivityStateChange;
        public ProbeBatteryLevelChange probeBatteryLevelChange;
        public ProbeRSSIChange probeRSSIChange;
        public ProbeReadCookSetupEvent probeReadCookSetupEvent;
        public ProbeReadTempLogEvent probeReadTempLogEvent;
        public MEATERDeviceReset probeReset;
        public ProbeWriteCookSetupEvent probeWriteCookSetupEvent;
        public BLERadioStateChange radioStateChange;
        public Integer time;

        public Builder alertFiredEvent(AlertFiredEvent alertFiredEvent) {
            this.alertFiredEvent = alertFiredEvent;
            return this;
        }

        public Builder appActionMessage(AppActionMessage appActionMessage) {
            this.appActionMessage = appActionMessage;
            return this;
        }

        public Builder appBackgroundStateChange(AppBackgroundStateChange appBackgroundStateChange) {
            this.appBackgroundStateChange = appBackgroundStateChange;
            return this;
        }

        public Builder bleProbeConnectionEvent(BLEProbeConnectionEvent bLEProbeConnectionEvent) {
            this.bleProbeConnectionEvent = bLEProbeConnectionEvent;
            return this;
        }

        public Builder cookEstimatorLogRecording(CookEstimatorLogRecording cookEstimatorLogRecording) {
            this.cookEstimatorLogRecording = cookEstimatorLogRecording;
            return this;
        }

        public Builder deviceTemperatureRecording(MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording) {
            this.deviceTemperatureRecording = mEATERDeviceTemperatureRecording;
            return this;
        }

        public Builder error(MEATERErrorEvent mEATERErrorEvent) {
            this.error = mEATERErrorEvent;
            return this;
        }

        public Builder meaterBlockBLERSSIChange(MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange) {
            this.meaterBlockBLERSSIChange = mEATERBlockBLERSSIChange;
            return this;
        }

        public Builder meaterCloudStateChange(MEATERCloudStateChange mEATERCloudStateChange) {
            this.meaterCloudStateChange = mEATERCloudStateChange;
            return this;
        }

        public Builder meaterLinkClientSubscriptionEvent(MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent) {
            this.meaterLinkClientSubscriptionEvent = mEATERLinkClientSubscriptionEvent;
            return this;
        }

        public Builder meaterLinkStateChange(MEATERLinkStateChange mEATERLinkStateChange) {
            this.meaterLinkStateChange = mEATERLinkStateChange;
            return this;
        }

        public Builder meaterPlusBatteryLevelChange(MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange) {
            this.meaterPlusBatteryLevelChange = mEATERPlusBatteryLevelChange;
            return this;
        }

        public Builder meaterPlusProbeConnectionEvent(MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent) {
            this.meaterPlusProbeConnectionEvent = mEATERPlusProbeConnectionEvent;
            return this;
        }

        public Builder meaterPlusRSSIChange(MEATERPlusRSSIChange mEATERPlusRSSIChange) {
            this.meaterPlusRSSIChange = mEATERPlusRSSIChange;
            return this;
        }

        public Builder networkConnectivityStateChange(NetworkConnectivityStateChange networkConnectivityStateChange) {
            this.networkConnectivityStateChange = networkConnectivityStateChange;
            return this;
        }

        public Builder probeBatteryLevelChange(ProbeBatteryLevelChange probeBatteryLevelChange) {
            this.probeBatteryLevelChange = probeBatteryLevelChange;
            return this;
        }

        public Builder probeRSSIChange(ProbeRSSIChange probeRSSIChange) {
            this.probeRSSIChange = probeRSSIChange;
            return this;
        }

        public Builder probeReadCookSetupEvent(ProbeReadCookSetupEvent probeReadCookSetupEvent) {
            this.probeReadCookSetupEvent = probeReadCookSetupEvent;
            return this;
        }

        public Builder probeReadTempLogEvent(ProbeReadTempLogEvent probeReadTempLogEvent) {
            this.probeReadTempLogEvent = probeReadTempLogEvent;
            return this;
        }

        public Builder probeReset(MEATERDeviceReset mEATERDeviceReset) {
            this.probeReset = mEATERDeviceReset;
            return this;
        }

        public Builder probeWriteCookSetupEvent(ProbeWriteCookSetupEvent probeWriteCookSetupEvent) {
            this.probeWriteCookSetupEvent = probeWriteCookSetupEvent;
            return this;
        }

        public Builder radioStateChange(BLERadioStateChange bLERadioStateChange) {
            this.radioStateChange = bLERadioStateChange;
            return this;
        }

        public Builder time(Integer num) {
            this.time = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATEREvent m222build() {
            Integer num = this.time;
            if (num != null) {
                return new MEATEREvent(this.time, this.radioStateChange, this.networkConnectivityStateChange, this.meaterLinkStateChange, this.meaterCloudStateChange, this.probeRSSIChange, this.probeBatteryLevelChange, this.cookEstimatorLogRecording, this.meaterLinkClientSubscriptionEvent, this.bleProbeConnectionEvent, this.probeReadCookSetupEvent, this.probeReadTempLogEvent, this.alertFiredEvent, this.appBackgroundStateChange, this.error, this.meaterPlusRSSIChange, this.meaterPlusBatteryLevelChange, this.meaterPlusProbeConnectionEvent, this.appActionMessage, this.meaterBlockBLERSSIChange, this.deviceTemperatureRecording, this.probeReset, this.probeWriteCookSetupEvent, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "time"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATEREvent extends ProtoAdapter<MEATEREvent> {
        ProtoAdapter_MEATEREvent() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATEREvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATEREvent m223decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.time((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 2:
                            builder.radioStateChange((BLERadioStateChange) BLERadioStateChange.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.networkConnectivityStateChange((NetworkConnectivityStateChange) NetworkConnectivityStateChange.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.meaterLinkStateChange((MEATERLinkStateChange) MEATERLinkStateChange.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.meaterCloudStateChange((MEATERCloudStateChange) MEATERCloudStateChange.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.probeRSSIChange((ProbeRSSIChange) ProbeRSSIChange.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.probeBatteryLevelChange((ProbeBatteryLevelChange) ProbeBatteryLevelChange.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.cookEstimatorLogRecording((CookEstimatorLogRecording) CookEstimatorLogRecording.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.meaterLinkClientSubscriptionEvent((MEATERLinkClientSubscriptionEvent) MEATERLinkClientSubscriptionEvent.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.bleProbeConnectionEvent((BLEProbeConnectionEvent) BLEProbeConnectionEvent.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.probeReadCookSetupEvent((ProbeReadCookSetupEvent) ProbeReadCookSetupEvent.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.probeReadTempLogEvent((ProbeReadTempLogEvent) ProbeReadTempLogEvent.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.alertFiredEvent((AlertFiredEvent) AlertFiredEvent.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            builder.appBackgroundStateChange((AppBackgroundStateChange) AppBackgroundStateChange.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.error((MEATERErrorEvent) MEATERErrorEvent.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.meaterPlusRSSIChange((MEATERPlusRSSIChange) MEATERPlusRSSIChange.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.meaterPlusBatteryLevelChange((MEATERPlusBatteryLevelChange) MEATERPlusBatteryLevelChange.ADAPTER.decode(protoReader));
                            break;
                        case 18:
                            builder.meaterPlusProbeConnectionEvent((MEATERPlusProbeConnectionEvent) MEATERPlusProbeConnectionEvent.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.appActionMessage((AppActionMessage) AppActionMessage.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            builder.meaterBlockBLERSSIChange((MEATERBlockBLERSSIChange) MEATERBlockBLERSSIChange.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            builder.deviceTemperatureRecording((MEATERDeviceTemperatureRecording) MEATERDeviceTemperatureRecording.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            builder.probeReset((MEATERDeviceReset) MEATERDeviceReset.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            builder.probeWriteCookSetupEvent((ProbeWriteCookSetupEvent) ProbeWriteCookSetupEvent.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m222build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATEREvent mEATEREvent) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, mEATEREvent.time);
            BLERadioStateChange bLERadioStateChange = mEATEREvent.radioStateChange;
            if (bLERadioStateChange != null) {
                BLERadioStateChange.ADAPTER.encodeWithTag(protoWriter, 2, bLERadioStateChange);
            }
            NetworkConnectivityStateChange networkConnectivityStateChange = mEATEREvent.networkConnectivityStateChange;
            if (networkConnectivityStateChange != null) {
                NetworkConnectivityStateChange.ADAPTER.encodeWithTag(protoWriter, 3, networkConnectivityStateChange);
            }
            MEATERLinkStateChange mEATERLinkStateChange = mEATEREvent.meaterLinkStateChange;
            if (mEATERLinkStateChange != null) {
                MEATERLinkStateChange.ADAPTER.encodeWithTag(protoWriter, 4, mEATERLinkStateChange);
            }
            MEATERCloudStateChange mEATERCloudStateChange = mEATEREvent.meaterCloudStateChange;
            if (mEATERCloudStateChange != null) {
                MEATERCloudStateChange.ADAPTER.encodeWithTag(protoWriter, 5, mEATERCloudStateChange);
            }
            ProbeRSSIChange probeRSSIChange = mEATEREvent.probeRSSIChange;
            if (probeRSSIChange != null) {
                ProbeRSSIChange.ADAPTER.encodeWithTag(protoWriter, 6, probeRSSIChange);
            }
            ProbeBatteryLevelChange probeBatteryLevelChange = mEATEREvent.probeBatteryLevelChange;
            if (probeBatteryLevelChange != null) {
                ProbeBatteryLevelChange.ADAPTER.encodeWithTag(protoWriter, 7, probeBatteryLevelChange);
            }
            CookEstimatorLogRecording cookEstimatorLogRecording = mEATEREvent.cookEstimatorLogRecording;
            if (cookEstimatorLogRecording != null) {
                CookEstimatorLogRecording.ADAPTER.encodeWithTag(protoWriter, 8, cookEstimatorLogRecording);
            }
            MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent = mEATEREvent.meaterLinkClientSubscriptionEvent;
            if (mEATERLinkClientSubscriptionEvent != null) {
                MEATERLinkClientSubscriptionEvent.ADAPTER.encodeWithTag(protoWriter, 9, mEATERLinkClientSubscriptionEvent);
            }
            BLEProbeConnectionEvent bLEProbeConnectionEvent = mEATEREvent.bleProbeConnectionEvent;
            if (bLEProbeConnectionEvent != null) {
                BLEProbeConnectionEvent.ADAPTER.encodeWithTag(protoWriter, 10, bLEProbeConnectionEvent);
            }
            ProbeReadCookSetupEvent probeReadCookSetupEvent = mEATEREvent.probeReadCookSetupEvent;
            if (probeReadCookSetupEvent != null) {
                ProbeReadCookSetupEvent.ADAPTER.encodeWithTag(protoWriter, 11, probeReadCookSetupEvent);
            }
            ProbeReadTempLogEvent probeReadTempLogEvent = mEATEREvent.probeReadTempLogEvent;
            if (probeReadTempLogEvent != null) {
                ProbeReadTempLogEvent.ADAPTER.encodeWithTag(protoWriter, 12, probeReadTempLogEvent);
            }
            AlertFiredEvent alertFiredEvent = mEATEREvent.alertFiredEvent;
            if (alertFiredEvent != null) {
                AlertFiredEvent.ADAPTER.encodeWithTag(protoWriter, 13, alertFiredEvent);
            }
            AppBackgroundStateChange appBackgroundStateChange = mEATEREvent.appBackgroundStateChange;
            if (appBackgroundStateChange != null) {
                AppBackgroundStateChange.ADAPTER.encodeWithTag(protoWriter, 14, appBackgroundStateChange);
            }
            MEATERErrorEvent mEATERErrorEvent = mEATEREvent.error;
            if (mEATERErrorEvent != null) {
                MEATERErrorEvent.ADAPTER.encodeWithTag(protoWriter, 15, mEATERErrorEvent);
            }
            MEATERPlusRSSIChange mEATERPlusRSSIChange = mEATEREvent.meaterPlusRSSIChange;
            if (mEATERPlusRSSIChange != null) {
                MEATERPlusRSSIChange.ADAPTER.encodeWithTag(protoWriter, 16, mEATERPlusRSSIChange);
            }
            MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange = mEATEREvent.meaterPlusBatteryLevelChange;
            if (mEATERPlusBatteryLevelChange != null) {
                MEATERPlusBatteryLevelChange.ADAPTER.encodeWithTag(protoWriter, 17, mEATERPlusBatteryLevelChange);
            }
            MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent = mEATEREvent.meaterPlusProbeConnectionEvent;
            if (mEATERPlusProbeConnectionEvent != null) {
                MEATERPlusProbeConnectionEvent.ADAPTER.encodeWithTag(protoWriter, 18, mEATERPlusProbeConnectionEvent);
            }
            AppActionMessage appActionMessage = mEATEREvent.appActionMessage;
            if (appActionMessage != null) {
                AppActionMessage.ADAPTER.encodeWithTag(protoWriter, 19, appActionMessage);
            }
            MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange = mEATEREvent.meaterBlockBLERSSIChange;
            if (mEATERBlockBLERSSIChange != null) {
                MEATERBlockBLERSSIChange.ADAPTER.encodeWithTag(protoWriter, 20, mEATERBlockBLERSSIChange);
            }
            MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording = mEATEREvent.deviceTemperatureRecording;
            if (mEATERDeviceTemperatureRecording != null) {
                MEATERDeviceTemperatureRecording.ADAPTER.encodeWithTag(protoWriter, 21, mEATERDeviceTemperatureRecording);
            }
            MEATERDeviceReset mEATERDeviceReset = mEATEREvent.probeReset;
            if (mEATERDeviceReset != null) {
                MEATERDeviceReset.ADAPTER.encodeWithTag(protoWriter, 22, mEATERDeviceReset);
            }
            ProbeWriteCookSetupEvent probeWriteCookSetupEvent = mEATEREvent.probeWriteCookSetupEvent;
            if (probeWriteCookSetupEvent != null) {
                ProbeWriteCookSetupEvent.ADAPTER.encodeWithTag(protoWriter, 23, probeWriteCookSetupEvent);
            }
            protoWriter.writeBytes(mEATEREvent.unknownFields());
        }

        public int encodedSize(MEATEREvent mEATEREvent) {
            int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, mEATEREvent.time);
            BLERadioStateChange bLERadioStateChange = mEATEREvent.radioStateChange;
            int encodedSizeWithTag2 = encodedSizeWithTag + (bLERadioStateChange != null ? BLERadioStateChange.ADAPTER.encodedSizeWithTag(2, bLERadioStateChange) : 0);
            NetworkConnectivityStateChange networkConnectivityStateChange = mEATEREvent.networkConnectivityStateChange;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (networkConnectivityStateChange != null ? NetworkConnectivityStateChange.ADAPTER.encodedSizeWithTag(3, networkConnectivityStateChange) : 0);
            MEATERLinkStateChange mEATERLinkStateChange = mEATEREvent.meaterLinkStateChange;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (mEATERLinkStateChange != null ? MEATERLinkStateChange.ADAPTER.encodedSizeWithTag(4, mEATERLinkStateChange) : 0);
            MEATERCloudStateChange mEATERCloudStateChange = mEATEREvent.meaterCloudStateChange;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (mEATERCloudStateChange != null ? MEATERCloudStateChange.ADAPTER.encodedSizeWithTag(5, mEATERCloudStateChange) : 0);
            ProbeRSSIChange probeRSSIChange = mEATEREvent.probeRSSIChange;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (probeRSSIChange != null ? ProbeRSSIChange.ADAPTER.encodedSizeWithTag(6, probeRSSIChange) : 0);
            ProbeBatteryLevelChange probeBatteryLevelChange = mEATEREvent.probeBatteryLevelChange;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (probeBatteryLevelChange != null ? ProbeBatteryLevelChange.ADAPTER.encodedSizeWithTag(7, probeBatteryLevelChange) : 0);
            CookEstimatorLogRecording cookEstimatorLogRecording = mEATEREvent.cookEstimatorLogRecording;
            int encodedSizeWithTag8 = encodedSizeWithTag7 + (cookEstimatorLogRecording != null ? CookEstimatorLogRecording.ADAPTER.encodedSizeWithTag(8, cookEstimatorLogRecording) : 0);
            MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent = mEATEREvent.meaterLinkClientSubscriptionEvent;
            int encodedSizeWithTag9 = encodedSizeWithTag8 + (mEATERLinkClientSubscriptionEvent != null ? MEATERLinkClientSubscriptionEvent.ADAPTER.encodedSizeWithTag(9, mEATERLinkClientSubscriptionEvent) : 0);
            BLEProbeConnectionEvent bLEProbeConnectionEvent = mEATEREvent.bleProbeConnectionEvent;
            int encodedSizeWithTag10 = encodedSizeWithTag9 + (bLEProbeConnectionEvent != null ? BLEProbeConnectionEvent.ADAPTER.encodedSizeWithTag(10, bLEProbeConnectionEvent) : 0);
            ProbeReadCookSetupEvent probeReadCookSetupEvent = mEATEREvent.probeReadCookSetupEvent;
            int encodedSizeWithTag11 = encodedSizeWithTag10 + (probeReadCookSetupEvent != null ? ProbeReadCookSetupEvent.ADAPTER.encodedSizeWithTag(11, probeReadCookSetupEvent) : 0);
            ProbeReadTempLogEvent probeReadTempLogEvent = mEATEREvent.probeReadTempLogEvent;
            int encodedSizeWithTag12 = encodedSizeWithTag11 + (probeReadTempLogEvent != null ? ProbeReadTempLogEvent.ADAPTER.encodedSizeWithTag(12, probeReadTempLogEvent) : 0);
            AlertFiredEvent alertFiredEvent = mEATEREvent.alertFiredEvent;
            int encodedSizeWithTag13 = encodedSizeWithTag12 + (alertFiredEvent != null ? AlertFiredEvent.ADAPTER.encodedSizeWithTag(13, alertFiredEvent) : 0);
            AppBackgroundStateChange appBackgroundStateChange = mEATEREvent.appBackgroundStateChange;
            int encodedSizeWithTag14 = encodedSizeWithTag13 + (appBackgroundStateChange != null ? AppBackgroundStateChange.ADAPTER.encodedSizeWithTag(14, appBackgroundStateChange) : 0);
            MEATERErrorEvent mEATERErrorEvent = mEATEREvent.error;
            int encodedSizeWithTag15 = encodedSizeWithTag14 + (mEATERErrorEvent != null ? MEATERErrorEvent.ADAPTER.encodedSizeWithTag(15, mEATERErrorEvent) : 0);
            MEATERPlusRSSIChange mEATERPlusRSSIChange = mEATEREvent.meaterPlusRSSIChange;
            int encodedSizeWithTag16 = encodedSizeWithTag15 + (mEATERPlusRSSIChange != null ? MEATERPlusRSSIChange.ADAPTER.encodedSizeWithTag(16, mEATERPlusRSSIChange) : 0);
            MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange = mEATEREvent.meaterPlusBatteryLevelChange;
            int encodedSizeWithTag17 = encodedSizeWithTag16 + (mEATERPlusBatteryLevelChange != null ? MEATERPlusBatteryLevelChange.ADAPTER.encodedSizeWithTag(17, mEATERPlusBatteryLevelChange) : 0);
            MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent = mEATEREvent.meaterPlusProbeConnectionEvent;
            int encodedSizeWithTag18 = encodedSizeWithTag17 + (mEATERPlusProbeConnectionEvent != null ? MEATERPlusProbeConnectionEvent.ADAPTER.encodedSizeWithTag(18, mEATERPlusProbeConnectionEvent) : 0);
            AppActionMessage appActionMessage = mEATEREvent.appActionMessage;
            int encodedSizeWithTag19 = encodedSizeWithTag18 + (appActionMessage != null ? AppActionMessage.ADAPTER.encodedSizeWithTag(19, appActionMessage) : 0);
            MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange = mEATEREvent.meaterBlockBLERSSIChange;
            int encodedSizeWithTag20 = encodedSizeWithTag19 + (mEATERBlockBLERSSIChange != null ? MEATERBlockBLERSSIChange.ADAPTER.encodedSizeWithTag(20, mEATERBlockBLERSSIChange) : 0);
            MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording = mEATEREvent.deviceTemperatureRecording;
            int encodedSizeWithTag21 = encodedSizeWithTag20 + (mEATERDeviceTemperatureRecording != null ? MEATERDeviceTemperatureRecording.ADAPTER.encodedSizeWithTag(21, mEATERDeviceTemperatureRecording) : 0);
            MEATERDeviceReset mEATERDeviceReset = mEATEREvent.probeReset;
            int encodedSizeWithTag22 = encodedSizeWithTag21 + (mEATERDeviceReset != null ? MEATERDeviceReset.ADAPTER.encodedSizeWithTag(22, mEATERDeviceReset) : 0);
            ProbeWriteCookSetupEvent probeWriteCookSetupEvent = mEATEREvent.probeWriteCookSetupEvent;
            return encodedSizeWithTag22 + (probeWriteCookSetupEvent != null ? ProbeWriteCookSetupEvent.ADAPTER.encodedSizeWithTag(23, probeWriteCookSetupEvent) : 0) + mEATEREvent.unknownFields().I();
        }

        public MEATEREvent redact(MEATEREvent mEATEREvent) {
            Builder m221newBuilder = mEATEREvent.m221newBuilder();
            BLERadioStateChange bLERadioStateChange = m221newBuilder.radioStateChange;
            if (bLERadioStateChange != null) {
                m221newBuilder.radioStateChange = (BLERadioStateChange) BLERadioStateChange.ADAPTER.redact(bLERadioStateChange);
            }
            NetworkConnectivityStateChange networkConnectivityStateChange = m221newBuilder.networkConnectivityStateChange;
            if (networkConnectivityStateChange != null) {
                m221newBuilder.networkConnectivityStateChange = (NetworkConnectivityStateChange) NetworkConnectivityStateChange.ADAPTER.redact(networkConnectivityStateChange);
            }
            MEATERLinkStateChange mEATERLinkStateChange = m221newBuilder.meaterLinkStateChange;
            if (mEATERLinkStateChange != null) {
                m221newBuilder.meaterLinkStateChange = (MEATERLinkStateChange) MEATERLinkStateChange.ADAPTER.redact(mEATERLinkStateChange);
            }
            MEATERCloudStateChange mEATERCloudStateChange = m221newBuilder.meaterCloudStateChange;
            if (mEATERCloudStateChange != null) {
                m221newBuilder.meaterCloudStateChange = (MEATERCloudStateChange) MEATERCloudStateChange.ADAPTER.redact(mEATERCloudStateChange);
            }
            ProbeRSSIChange probeRSSIChange = m221newBuilder.probeRSSIChange;
            if (probeRSSIChange != null) {
                m221newBuilder.probeRSSIChange = (ProbeRSSIChange) ProbeRSSIChange.ADAPTER.redact(probeRSSIChange);
            }
            ProbeBatteryLevelChange probeBatteryLevelChange = m221newBuilder.probeBatteryLevelChange;
            if (probeBatteryLevelChange != null) {
                m221newBuilder.probeBatteryLevelChange = (ProbeBatteryLevelChange) ProbeBatteryLevelChange.ADAPTER.redact(probeBatteryLevelChange);
            }
            CookEstimatorLogRecording cookEstimatorLogRecording = m221newBuilder.cookEstimatorLogRecording;
            if (cookEstimatorLogRecording != null) {
                m221newBuilder.cookEstimatorLogRecording = (CookEstimatorLogRecording) CookEstimatorLogRecording.ADAPTER.redact(cookEstimatorLogRecording);
            }
            MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent = m221newBuilder.meaterLinkClientSubscriptionEvent;
            if (mEATERLinkClientSubscriptionEvent != null) {
                m221newBuilder.meaterLinkClientSubscriptionEvent = (MEATERLinkClientSubscriptionEvent) MEATERLinkClientSubscriptionEvent.ADAPTER.redact(mEATERLinkClientSubscriptionEvent);
            }
            BLEProbeConnectionEvent bLEProbeConnectionEvent = m221newBuilder.bleProbeConnectionEvent;
            if (bLEProbeConnectionEvent != null) {
                m221newBuilder.bleProbeConnectionEvent = (BLEProbeConnectionEvent) BLEProbeConnectionEvent.ADAPTER.redact(bLEProbeConnectionEvent);
            }
            ProbeReadCookSetupEvent probeReadCookSetupEvent = m221newBuilder.probeReadCookSetupEvent;
            if (probeReadCookSetupEvent != null) {
                m221newBuilder.probeReadCookSetupEvent = (ProbeReadCookSetupEvent) ProbeReadCookSetupEvent.ADAPTER.redact(probeReadCookSetupEvent);
            }
            ProbeReadTempLogEvent probeReadTempLogEvent = m221newBuilder.probeReadTempLogEvent;
            if (probeReadTempLogEvent != null) {
                m221newBuilder.probeReadTempLogEvent = (ProbeReadTempLogEvent) ProbeReadTempLogEvent.ADAPTER.redact(probeReadTempLogEvent);
            }
            AlertFiredEvent alertFiredEvent = m221newBuilder.alertFiredEvent;
            if (alertFiredEvent != null) {
                m221newBuilder.alertFiredEvent = (AlertFiredEvent) AlertFiredEvent.ADAPTER.redact(alertFiredEvent);
            }
            AppBackgroundStateChange appBackgroundStateChange = m221newBuilder.appBackgroundStateChange;
            if (appBackgroundStateChange != null) {
                m221newBuilder.appBackgroundStateChange = (AppBackgroundStateChange) AppBackgroundStateChange.ADAPTER.redact(appBackgroundStateChange);
            }
            MEATERErrorEvent mEATERErrorEvent = m221newBuilder.error;
            if (mEATERErrorEvent != null) {
                m221newBuilder.error = (MEATERErrorEvent) MEATERErrorEvent.ADAPTER.redact(mEATERErrorEvent);
            }
            MEATERPlusRSSIChange mEATERPlusRSSIChange = m221newBuilder.meaterPlusRSSIChange;
            if (mEATERPlusRSSIChange != null) {
                m221newBuilder.meaterPlusRSSIChange = (MEATERPlusRSSIChange) MEATERPlusRSSIChange.ADAPTER.redact(mEATERPlusRSSIChange);
            }
            MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange = m221newBuilder.meaterPlusBatteryLevelChange;
            if (mEATERPlusBatteryLevelChange != null) {
                m221newBuilder.meaterPlusBatteryLevelChange = (MEATERPlusBatteryLevelChange) MEATERPlusBatteryLevelChange.ADAPTER.redact(mEATERPlusBatteryLevelChange);
            }
            MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent = m221newBuilder.meaterPlusProbeConnectionEvent;
            if (mEATERPlusProbeConnectionEvent != null) {
                m221newBuilder.meaterPlusProbeConnectionEvent = (MEATERPlusProbeConnectionEvent) MEATERPlusProbeConnectionEvent.ADAPTER.redact(mEATERPlusProbeConnectionEvent);
            }
            AppActionMessage appActionMessage = m221newBuilder.appActionMessage;
            if (appActionMessage != null) {
                m221newBuilder.appActionMessage = (AppActionMessage) AppActionMessage.ADAPTER.redact(appActionMessage);
            }
            MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange = m221newBuilder.meaterBlockBLERSSIChange;
            if (mEATERBlockBLERSSIChange != null) {
                m221newBuilder.meaterBlockBLERSSIChange = (MEATERBlockBLERSSIChange) MEATERBlockBLERSSIChange.ADAPTER.redact(mEATERBlockBLERSSIChange);
            }
            MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording = m221newBuilder.deviceTemperatureRecording;
            if (mEATERDeviceTemperatureRecording != null) {
                m221newBuilder.deviceTemperatureRecording = (MEATERDeviceTemperatureRecording) MEATERDeviceTemperatureRecording.ADAPTER.redact(mEATERDeviceTemperatureRecording);
            }
            MEATERDeviceReset mEATERDeviceReset = m221newBuilder.probeReset;
            if (mEATERDeviceReset != null) {
                m221newBuilder.probeReset = (MEATERDeviceReset) MEATERDeviceReset.ADAPTER.redact(mEATERDeviceReset);
            }
            ProbeWriteCookSetupEvent probeWriteCookSetupEvent = m221newBuilder.probeWriteCookSetupEvent;
            if (probeWriteCookSetupEvent != null) {
                m221newBuilder.probeWriteCookSetupEvent = (ProbeWriteCookSetupEvent) ProbeWriteCookSetupEvent.ADAPTER.redact(probeWriteCookSetupEvent);
            }
            m221newBuilder.clearUnknownFields();
            return m221newBuilder.m222build();
        }
    }

    public MEATEREvent(Integer num, BLERadioStateChange bLERadioStateChange, NetworkConnectivityStateChange networkConnectivityStateChange, MEATERLinkStateChange mEATERLinkStateChange, MEATERCloudStateChange mEATERCloudStateChange, ProbeRSSIChange probeRSSIChange, ProbeBatteryLevelChange probeBatteryLevelChange, CookEstimatorLogRecording cookEstimatorLogRecording, MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent, BLEProbeConnectionEvent bLEProbeConnectionEvent, ProbeReadCookSetupEvent probeReadCookSetupEvent, ProbeReadTempLogEvent probeReadTempLogEvent, AlertFiredEvent alertFiredEvent, AppBackgroundStateChange appBackgroundStateChange, MEATERErrorEvent mEATERErrorEvent, MEATERPlusRSSIChange mEATERPlusRSSIChange, MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange, MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent, AppActionMessage appActionMessage, MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange, MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording, MEATERDeviceReset mEATERDeviceReset, ProbeWriteCookSetupEvent probeWriteCookSetupEvent) {
        this(num, bLERadioStateChange, networkConnectivityStateChange, mEATERLinkStateChange, mEATERCloudStateChange, probeRSSIChange, probeBatteryLevelChange, cookEstimatorLogRecording, mEATERLinkClientSubscriptionEvent, bLEProbeConnectionEvent, probeReadCookSetupEvent, probeReadTempLogEvent, alertFiredEvent, appBackgroundStateChange, mEATERErrorEvent, mEATERPlusRSSIChange, mEATERPlusBatteryLevelChange, mEATERPlusProbeConnectionEvent, appActionMessage, mEATERBlockBLERSSIChange, mEATERDeviceTemperatureRecording, mEATERDeviceReset, probeWriteCookSetupEvent, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATEREvent)) {
            return false;
        }
        MEATEREvent mEATEREvent = (MEATEREvent) obj;
        if (Internal.equals(unknownFields(), mEATEREvent.unknownFields()) && Internal.equals(this.time, mEATEREvent.time) && Internal.equals(this.radioStateChange, mEATEREvent.radioStateChange) && Internal.equals(this.networkConnectivityStateChange, mEATEREvent.networkConnectivityStateChange) && Internal.equals(this.meaterLinkStateChange, mEATEREvent.meaterLinkStateChange) && Internal.equals(this.meaterCloudStateChange, mEATEREvent.meaterCloudStateChange) && Internal.equals(this.probeRSSIChange, mEATEREvent.probeRSSIChange) && Internal.equals(this.probeBatteryLevelChange, mEATEREvent.probeBatteryLevelChange) && Internal.equals(this.cookEstimatorLogRecording, mEATEREvent.cookEstimatorLogRecording) && Internal.equals(this.meaterLinkClientSubscriptionEvent, mEATEREvent.meaterLinkClientSubscriptionEvent) && Internal.equals(this.bleProbeConnectionEvent, mEATEREvent.bleProbeConnectionEvent) && Internal.equals(this.probeReadCookSetupEvent, mEATEREvent.probeReadCookSetupEvent) && Internal.equals(this.probeReadTempLogEvent, mEATEREvent.probeReadTempLogEvent) && Internal.equals(this.alertFiredEvent, mEATEREvent.alertFiredEvent) && Internal.equals(this.appBackgroundStateChange, mEATEREvent.appBackgroundStateChange) && Internal.equals(this.error, mEATEREvent.error) && Internal.equals(this.meaterPlusRSSIChange, mEATEREvent.meaterPlusRSSIChange) && Internal.equals(this.meaterPlusBatteryLevelChange, mEATEREvent.meaterPlusBatteryLevelChange) && Internal.equals(this.meaterPlusProbeConnectionEvent, mEATEREvent.meaterPlusProbeConnectionEvent) && Internal.equals(this.appActionMessage, mEATEREvent.appActionMessage) && Internal.equals(this.meaterBlockBLERSSIChange, mEATEREvent.meaterBlockBLERSSIChange) && Internal.equals(this.deviceTemperatureRecording, mEATEREvent.deviceTemperatureRecording) && Internal.equals(this.probeReset, mEATEREvent.probeReset) && Internal.equals(this.probeWriteCookSetupEvent, mEATEREvent.probeWriteCookSetupEvent)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32 = ((Message) this).hashCode;
        if (i32 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.time;
            int i33 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i34 = (hashCode + i10) * 37;
            BLERadioStateChange bLERadioStateChange = this.radioStateChange;
            if (bLERadioStateChange != null) {
                i11 = bLERadioStateChange.hashCode();
            } else {
                i11 = 0;
            }
            int i35 = (i34 + i11) * 37;
            NetworkConnectivityStateChange networkConnectivityStateChange = this.networkConnectivityStateChange;
            if (networkConnectivityStateChange != null) {
                i12 = networkConnectivityStateChange.hashCode();
            } else {
                i12 = 0;
            }
            int i36 = (i35 + i12) * 37;
            MEATERLinkStateChange mEATERLinkStateChange = this.meaterLinkStateChange;
            if (mEATERLinkStateChange != null) {
                i13 = mEATERLinkStateChange.hashCode();
            } else {
                i13 = 0;
            }
            int i37 = (i36 + i13) * 37;
            MEATERCloudStateChange mEATERCloudStateChange = this.meaterCloudStateChange;
            if (mEATERCloudStateChange != null) {
                i14 = mEATERCloudStateChange.hashCode();
            } else {
                i14 = 0;
            }
            int i38 = (i37 + i14) * 37;
            ProbeRSSIChange probeRSSIChange = this.probeRSSIChange;
            if (probeRSSIChange != null) {
                i15 = probeRSSIChange.hashCode();
            } else {
                i15 = 0;
            }
            int i39 = (i38 + i15) * 37;
            ProbeBatteryLevelChange probeBatteryLevelChange = this.probeBatteryLevelChange;
            if (probeBatteryLevelChange != null) {
                i16 = probeBatteryLevelChange.hashCode();
            } else {
                i16 = 0;
            }
            int i40 = (i39 + i16) * 37;
            CookEstimatorLogRecording cookEstimatorLogRecording = this.cookEstimatorLogRecording;
            if (cookEstimatorLogRecording != null) {
                i17 = cookEstimatorLogRecording.hashCode();
            } else {
                i17 = 0;
            }
            int i41 = (i40 + i17) * 37;
            MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent = this.meaterLinkClientSubscriptionEvent;
            if (mEATERLinkClientSubscriptionEvent != null) {
                i18 = mEATERLinkClientSubscriptionEvent.hashCode();
            } else {
                i18 = 0;
            }
            int i42 = (i41 + i18) * 37;
            BLEProbeConnectionEvent bLEProbeConnectionEvent = this.bleProbeConnectionEvent;
            if (bLEProbeConnectionEvent != null) {
                i19 = bLEProbeConnectionEvent.hashCode();
            } else {
                i19 = 0;
            }
            int i43 = (i42 + i19) * 37;
            ProbeReadCookSetupEvent probeReadCookSetupEvent = this.probeReadCookSetupEvent;
            if (probeReadCookSetupEvent != null) {
                i20 = probeReadCookSetupEvent.hashCode();
            } else {
                i20 = 0;
            }
            int i44 = (i43 + i20) * 37;
            ProbeReadTempLogEvent probeReadTempLogEvent = this.probeReadTempLogEvent;
            if (probeReadTempLogEvent != null) {
                i21 = probeReadTempLogEvent.hashCode();
            } else {
                i21 = 0;
            }
            int i45 = (i44 + i21) * 37;
            AlertFiredEvent alertFiredEvent = this.alertFiredEvent;
            if (alertFiredEvent != null) {
                i22 = alertFiredEvent.hashCode();
            } else {
                i22 = 0;
            }
            int i46 = (i45 + i22) * 37;
            AppBackgroundStateChange appBackgroundStateChange = this.appBackgroundStateChange;
            if (appBackgroundStateChange != null) {
                i23 = appBackgroundStateChange.hashCode();
            } else {
                i23 = 0;
            }
            int i47 = (i46 + i23) * 37;
            MEATERErrorEvent mEATERErrorEvent = this.error;
            if (mEATERErrorEvent != null) {
                i24 = mEATERErrorEvent.hashCode();
            } else {
                i24 = 0;
            }
            int i48 = (i47 + i24) * 37;
            MEATERPlusRSSIChange mEATERPlusRSSIChange = this.meaterPlusRSSIChange;
            if (mEATERPlusRSSIChange != null) {
                i25 = mEATERPlusRSSIChange.hashCode();
            } else {
                i25 = 0;
            }
            int i49 = (i48 + i25) * 37;
            MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange = this.meaterPlusBatteryLevelChange;
            if (mEATERPlusBatteryLevelChange != null) {
                i26 = mEATERPlusBatteryLevelChange.hashCode();
            } else {
                i26 = 0;
            }
            int i50 = (i49 + i26) * 37;
            MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent = this.meaterPlusProbeConnectionEvent;
            if (mEATERPlusProbeConnectionEvent != null) {
                i27 = mEATERPlusProbeConnectionEvent.hashCode();
            } else {
                i27 = 0;
            }
            int i51 = (i50 + i27) * 37;
            AppActionMessage appActionMessage = this.appActionMessage;
            if (appActionMessage != null) {
                i28 = appActionMessage.hashCode();
            } else {
                i28 = 0;
            }
            int i52 = (i51 + i28) * 37;
            MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange = this.meaterBlockBLERSSIChange;
            if (mEATERBlockBLERSSIChange != null) {
                i29 = mEATERBlockBLERSSIChange.hashCode();
            } else {
                i29 = 0;
            }
            int i53 = (i52 + i29) * 37;
            MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording = this.deviceTemperatureRecording;
            if (mEATERDeviceTemperatureRecording != null) {
                i30 = mEATERDeviceTemperatureRecording.hashCode();
            } else {
                i30 = 0;
            }
            int i54 = (i53 + i30) * 37;
            MEATERDeviceReset mEATERDeviceReset = this.probeReset;
            if (mEATERDeviceReset != null) {
                i31 = mEATERDeviceReset.hashCode();
            } else {
                i31 = 0;
            }
            int i55 = (i54 + i31) * 37;
            ProbeWriteCookSetupEvent probeWriteCookSetupEvent = this.probeWriteCookSetupEvent;
            if (probeWriteCookSetupEvent != null) {
                i33 = probeWriteCookSetupEvent.hashCode();
            }
            int i56 = i55 + i33;
            ((Message) this).hashCode = i56;
            return i56;
        }
        return i32;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        if (this.radioStateChange != null) {
            sb.append(", radioStateChange=");
            sb.append(this.radioStateChange);
        }
        if (this.networkConnectivityStateChange != null) {
            sb.append(", networkConnectivityStateChange=");
            sb.append(this.networkConnectivityStateChange);
        }
        if (this.meaterLinkStateChange != null) {
            sb.append(", meaterLinkStateChange=");
            sb.append(this.meaterLinkStateChange);
        }
        if (this.meaterCloudStateChange != null) {
            sb.append(", meaterCloudStateChange=");
            sb.append(this.meaterCloudStateChange);
        }
        if (this.probeRSSIChange != null) {
            sb.append(", probeRSSIChange=");
            sb.append(this.probeRSSIChange);
        }
        if (this.probeBatteryLevelChange != null) {
            sb.append(", probeBatteryLevelChange=");
            sb.append(this.probeBatteryLevelChange);
        }
        if (this.cookEstimatorLogRecording != null) {
            sb.append(", cookEstimatorLogRecording=");
            sb.append(this.cookEstimatorLogRecording);
        }
        if (this.meaterLinkClientSubscriptionEvent != null) {
            sb.append(", meaterLinkClientSubscriptionEvent=");
            sb.append(this.meaterLinkClientSubscriptionEvent);
        }
        if (this.bleProbeConnectionEvent != null) {
            sb.append(", bleProbeConnectionEvent=");
            sb.append(this.bleProbeConnectionEvent);
        }
        if (this.probeReadCookSetupEvent != null) {
            sb.append(", probeReadCookSetupEvent=");
            sb.append(this.probeReadCookSetupEvent);
        }
        if (this.probeReadTempLogEvent != null) {
            sb.append(", probeReadTempLogEvent=");
            sb.append(this.probeReadTempLogEvent);
        }
        if (this.alertFiredEvent != null) {
            sb.append(", alertFiredEvent=");
            sb.append(this.alertFiredEvent);
        }
        if (this.appBackgroundStateChange != null) {
            sb.append(", appBackgroundStateChange=");
            sb.append(this.appBackgroundStateChange);
        }
        if (this.error != null) {
            sb.append(", error=");
            sb.append(this.error);
        }
        if (this.meaterPlusRSSIChange != null) {
            sb.append(", meaterPlusRSSIChange=");
            sb.append(this.meaterPlusRSSIChange);
        }
        if (this.meaterPlusBatteryLevelChange != null) {
            sb.append(", meaterPlusBatteryLevelChange=");
            sb.append(this.meaterPlusBatteryLevelChange);
        }
        if (this.meaterPlusProbeConnectionEvent != null) {
            sb.append(", meaterPlusProbeConnectionEvent=");
            sb.append(this.meaterPlusProbeConnectionEvent);
        }
        if (this.appActionMessage != null) {
            sb.append(", appActionMessage=");
            sb.append(this.appActionMessage);
        }
        if (this.meaterBlockBLERSSIChange != null) {
            sb.append(", meaterBlockBLERSSIChange=");
            sb.append(this.meaterBlockBLERSSIChange);
        }
        if (this.deviceTemperatureRecording != null) {
            sb.append(", deviceTemperatureRecording=");
            sb.append(this.deviceTemperatureRecording);
        }
        if (this.probeReset != null) {
            sb.append(", probeReset=");
            sb.append(this.probeReset);
        }
        if (this.probeWriteCookSetupEvent != null) {
            sb.append(", probeWriteCookSetupEvent=");
            sb.append(this.probeWriteCookSetupEvent);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATEREvent{");
        replace.append('}');
        return replace.toString();
    }

    public MEATEREvent(Integer num, BLERadioStateChange bLERadioStateChange, NetworkConnectivityStateChange networkConnectivityStateChange, MEATERLinkStateChange mEATERLinkStateChange, MEATERCloudStateChange mEATERCloudStateChange, ProbeRSSIChange probeRSSIChange, ProbeBatteryLevelChange probeBatteryLevelChange, CookEstimatorLogRecording cookEstimatorLogRecording, MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent, BLEProbeConnectionEvent bLEProbeConnectionEvent, ProbeReadCookSetupEvent probeReadCookSetupEvent, ProbeReadTempLogEvent probeReadTempLogEvent, AlertFiredEvent alertFiredEvent, AppBackgroundStateChange appBackgroundStateChange, MEATERErrorEvent mEATERErrorEvent, MEATERPlusRSSIChange mEATERPlusRSSIChange, MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange, MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent, AppActionMessage appActionMessage, MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange, MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording, MEATERDeviceReset mEATERDeviceReset, ProbeWriteCookSetupEvent probeWriteCookSetupEvent, h hVar) {
        super(ADAPTER, hVar);
        this.time = num;
        this.radioStateChange = bLERadioStateChange;
        this.networkConnectivityStateChange = networkConnectivityStateChange;
        this.meaterLinkStateChange = mEATERLinkStateChange;
        this.meaterCloudStateChange = mEATERCloudStateChange;
        this.probeRSSIChange = probeRSSIChange;
        this.probeBatteryLevelChange = probeBatteryLevelChange;
        this.cookEstimatorLogRecording = cookEstimatorLogRecording;
        this.meaterLinkClientSubscriptionEvent = mEATERLinkClientSubscriptionEvent;
        this.bleProbeConnectionEvent = bLEProbeConnectionEvent;
        this.probeReadCookSetupEvent = probeReadCookSetupEvent;
        this.probeReadTempLogEvent = probeReadTempLogEvent;
        this.alertFiredEvent = alertFiredEvent;
        this.appBackgroundStateChange = appBackgroundStateChange;
        this.error = mEATERErrorEvent;
        this.meaterPlusRSSIChange = mEATERPlusRSSIChange;
        this.meaterPlusBatteryLevelChange = mEATERPlusBatteryLevelChange;
        this.meaterPlusProbeConnectionEvent = mEATERPlusProbeConnectionEvent;
        this.appActionMessage = appActionMessage;
        this.meaterBlockBLERSSIChange = mEATERBlockBLERSSIChange;
        this.deviceTemperatureRecording = mEATERDeviceTemperatureRecording;
        this.probeReset = mEATERDeviceReset;
        this.probeWriteCookSetupEvent = probeWriteCookSetupEvent;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m221newBuilder() {
        Builder builder = new Builder();
        builder.time = this.time;
        builder.radioStateChange = this.radioStateChange;
        builder.networkConnectivityStateChange = this.networkConnectivityStateChange;
        builder.meaterLinkStateChange = this.meaterLinkStateChange;
        builder.meaterCloudStateChange = this.meaterCloudStateChange;
        builder.probeRSSIChange = this.probeRSSIChange;
        builder.probeBatteryLevelChange = this.probeBatteryLevelChange;
        builder.cookEstimatorLogRecording = this.cookEstimatorLogRecording;
        builder.meaterLinkClientSubscriptionEvent = this.meaterLinkClientSubscriptionEvent;
        builder.bleProbeConnectionEvent = this.bleProbeConnectionEvent;
        builder.probeReadCookSetupEvent = this.probeReadCookSetupEvent;
        builder.probeReadTempLogEvent = this.probeReadTempLogEvent;
        builder.alertFiredEvent = this.alertFiredEvent;
        builder.appBackgroundStateChange = this.appBackgroundStateChange;
        builder.error = this.error;
        builder.meaterPlusRSSIChange = this.meaterPlusRSSIChange;
        builder.meaterPlusBatteryLevelChange = this.meaterPlusBatteryLevelChange;
        builder.meaterPlusProbeConnectionEvent = this.meaterPlusProbeConnectionEvent;
        builder.appActionMessage = this.appActionMessage;
        builder.meaterBlockBLERSSIChange = this.meaterBlockBLERSSIChange;
        builder.deviceTemperatureRecording = this.deviceTemperatureRecording;
        builder.probeReset = this.probeReset;
        builder.probeWriteCookSetupEvent = this.probeWriteCookSetupEvent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
