# HTTP Discovery Protocol

> ⚠️ **INVESTIGATED AND RULED OUT**: This document describes the MEATER Block WiFi discovery protocol that was investigated as a possible approach but has been ruled out for this project.

> ⚠️ **CONTAINS ASSUMPTIONS**: This document contains reverse-engineered protocol information and assumptions about MEATER Block behavior. It is NOT based on direct extraction from decompiled app code. For verified protocol information extracted directly from source, see `tools/extracted_operations.json` and `tools/PROTOCOL_COMPARISON_RESULTS.md`.

## Status: RULED OUT

**Decision Date:** 2025-11-21

**Reason:** This approach was investigated but ruled out because:
1. It requires both UDP broadcasting AND HTTP server implementation
2. It adds significant complexity compared to direct BLE emulation
3. Real MEATER probes use BLE only, not WiFi
4. The BLE-only approach is closer to actual probe behavior

**Current Focus:** BLE server implementation to directly emulate MEATER probe behavior

---

## Overview (Historical)
This document outlines the discovery process for MEATER Blocks, focusing on the limitations of using UDP broadcasts alone in the discovery mechanism.

## Key Points
- **UDP Discovery**: The initial discovery of MEATER Blocks occurs via UDP broadcasts. This method is efficient for locating devices on the local network.
- **Limitations of UDP**: While UDP is effective for discovery, it does not support the data communication required for interacting with MEATER Blocks. 
- **HTTP Server Component**: For actual data transfers and commands after discovering devices via UDP, MEATER Blocks implement an HTTP server. This server facilitates reliable communication beyond the discovery phase.

## Conclusion
The reliance on UDP alone for discovery is insufficient for the comprehensive operation of MEATER Blocks. An HTTP server component is essential for enabling effective communication and data transfer.

**This approach has been ruled out in favor of BLE-only implementation.**