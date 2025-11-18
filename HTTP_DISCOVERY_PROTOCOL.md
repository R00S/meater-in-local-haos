# HTTP Discovery Protocol

## Overview
This document outlines the discovery process for MEATER Blocks, focusing on the limitations of using UDP broadcasts alone in the discovery mechanism.

## Key Points
- **UDP Discovery**: The initial discovery of MEATER Blocks occurs via UDP broadcasts. This method is efficient for locating devices on the local network.
- **Limitations of UDP**: While UDP is effective for discovery, it does not support the data communication required for interacting with MEATER Blocks. 
- **HTTP Server Component**: For actual data transfers and commands after discovering devices via UDP, MEATER Blocks implement an HTTP server. This server facilitates reliable communication beyond the discovery phase.

## Conclusion
The reliance on UDP alone for discovery is insufficient for the comprehensive operation of MEATER Blocks. An HTTP server component is essential for enabling effective communication and data transfer.