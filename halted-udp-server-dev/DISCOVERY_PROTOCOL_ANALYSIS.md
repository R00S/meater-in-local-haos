# MEATER Link Discovery Protocol Analysis

Based on deep analysis of the decompiled MEATER app code, here's the complete understanding of the discovery and communication protocol.

## Discovery Protocol Summary

**Good News**: The discovery is UDP-only - no mDNS/Bonjour required!

**Bad News**: An HTTP server component is required after UDP discovery for actual communication.

## Key Findings from Decompiled Code

### 1. UDP Discovery (Port 7878)

From `meater_app/data/ProtocolParameters.java`:

```java
public static final int MEATER_LINK_UDP_PORT = 7878;
public static final String MEATER_LINK_BROADCAST_ADDR = "ML.BroadCast";
```

- The Block broadcasts UDP packets on port 7878 with `MasterMessage` containing device info
- Our implementation correctly sends these broadcasts ✅

### 2. HTTP Server Component (Critical Missing Piece!)

The app includes **NanoHTTPD** - a full HTTP server implementation:

- `meater_app/nanoHttpd/NanoHTTPD.java` - Complete HTTP server with ServerSocket
- This runs **on the Block device itself**
- App discovers via UDP, then connects via HTTP for actual communication

**This is why our UDP broadcasts aren't working!**

The app expects to:
1. Discover Block via UDP broadcast
2. Extract IP address from UDP packet
3. **Connect to HTTP server on that IP for actual data exchange**

### 3. Protocol Version Constants

From `meater_app/v3protobuf/MeaterLinkHeader.java`:

```java
public static final Integer DEFAULT_MEATERLINKIDENTIFIER = 21578;
public static final Integer DEFAULT_VERSIONMAJOR = 2;
public static final Integer DEFAULT_VERSIONMINOR = 1;
public static final Integer DEFAULT_MESSAGENUMBER = 0;
```

✅ Our implementation already has these correct!

### 4. Discovery Message Types

From `meater_app/v3protobuf/MeaterLinkMessage.java`, the message wrapper supports:

- `subscriptionMessage` - Client subscribes to Block
- `masterMessage` - Block status broadcasts ✅ (we send this)
- `setupMessage` - Cook setup data
- `temperatureHistoryRequestMessage` - Request temp history
- `temperatureHistoryMessage` - Temperature history response
- `masterStatusMessage` - Detailed status updates

### 5. HTTP Communication After Discovery

After UDP discovery, the app:

1. Parses the UDP `MasterMessage` to get:
   - Device ID
   - IP address (from UDP source)
   - Port number (likely embedded in message or default)

2. Opens HTTP connection to Block:
   - Sends requests for temperature data
   - Receives responses with cook status
   - Maintains persistent connection

3. HTTP endpoints likely include:
   - Temperature readings
   - Cook setup/configuration
   - Historical data
   - Device status

## Current Implementation Status

### ✅ What We Have Working

1. UDP broadcast on port 7878
2. Correct `MeaterLinkHeader` structure (21578, v17.7)
3. Valid `MasterMessage` with:
   - `masterType = 0` (MASTER_TYPE_BLOCK)
   - `cloudConnectionState = 0` (DISABLED)
   - Empty devices array (idle Block)

### ❌ What's Missing

1. **HTTP server** - The critical missing component
   - Must listen on a specific port
   - Must respond to app requests
   - Must serve temperature/status data

2. **HTTP endpoints** - Need to implement:
   - Temperature data endpoint
   - Status endpoint
   - Possibly configuration endpoints

3. **Bidirectional communication** - After discovery:
   - App sends HTTP requests
   - Block sends HTTP responses
   - Real-time updates via HTTP (polling or websocket?)

## Next Steps

### Phase 1: Add HTTP Server

1. Implement ESPHome HTTP server component
2. Listen on appropriate port (default or from config)
3. Respond to basic health check requests

### Phase 2: Implement Data Endpoints

1. Temperature endpoint - Serve current probe temps
2. Status endpoint - Serve cook status
3. Device info endpoint - Firmware version, etc.

### Phase 3: Test Complete Flow

1. ESP32 broadcasts UDP (already working)
2. App discovers device via UDP
3. App connects to HTTP server
4. App retrieves temperature data
5. Device appears in MEATER app

## Protocol Flow Diagram

```
ESP32 (MEATER Block Emulator)          MEATER App
         |                                    |
         | UDP Broadcast (port 7878)         |
         | MasterMessage (Field 3)           |
         |---------------------------------->|
         |                                    | (Discovers device)
         |                                    | (Extracts IP from UDP)
         |        HTTP GET /temperature       |
         |<----------------------------------|
         |                                    |
         | HTTP 200 + Temperature JSON        |
         |---------------------------------->|
         |                                    | (Shows in app)
         |        HTTP GET /status            |
         |<----------------------------------|
         |                                    |
         | HTTP 200 + Status JSON             |
         |---------------------------------->|
         |                                    |
```

## Key Insight

**The UDP broadcast is only for discovery - it's not the data transport!**

The app uses UDP to find Blocks on the network, then switches to HTTP for all actual communication. This is why our perfectly valid UDP broadcasts don't result in device discovery - the app is immediately trying to connect via HTTP after receiving the UDP broadcast, and there's no HTTP server to respond.

## References

- `meater_app/nanoHttpd/NanoHTTPD.java` - HTTP server implementation
- `meater_app/v3protobuf/MeaterLinkMessage.java` - Protocol definition
- `meater_app/data/ProtocolParameters.java` - Constants and parameters
- Community implementations using HTTP: https://github.com/floyduww/MeaterBlockMQTT
