---
categories:
  - flight-controller
date: 2017-02-26T13:49:04-06:00
specs:
  gyro: ""
  integrated_osd: false
  integrated_pdb: false
  processor: "F3"
title: Lumenier LUX V2
type: flight-controller
external_url: http://www.getfpv.com/lumenier-lux-flight-controller.html
---
The Lumenier LUX V2 flight controller is the next generation of the popular Lumenier LUX. It uses a powerful F3 processor along with top of the line hardware. Unleash the capabilities of your FPV Racing Quadcopter with the Lumenier LUX Flight Controller. Achieve gyro refresh rates up to 8kHz (high speed SPI) using popular Betaflight, CleanFlight and RaceFlight firmware along with ultra low looptimes. The LUX comes with BetaFlight pre-installed.

The LUX V2 builds on all the best features of the V1 board and further improves on hardware components and layout. Now you get a whopping 5x dedicated UART ports for periphials, along with an SD Card slot for practically unlimited data logging. The MPU has also been updated to the low noise MPU6000 Gyro making tuning even easier. No longer do you need to solder jumper pads for PPM/SBUS selection, it is automatically chosen via software! The powerful F3 MCU also supports the latest DSHOT protocol available in the newest BetaFlight firmware.

The Lumenier LUX is a very low profile board allowing it to be mounted in a variety of ways. The board also comes with a set of pin headers you can optionally solder on. Alternatively, signal wires can be soldered directly to the pads to save on size and weight. The LUX supports PPM or Serial RX (including Futaba, FrSky, S.BUS, DSMX). A signal inverter is already included for S.BUS. Please note: PWM input for individual channels is not supported.

Please Note: The LUX V2 comes pre-loaded with the latest BetaFlight firmware, do not update the firmware with the old LUX V1 target as it will not function. The new LUX V2 firmware is currently unreleased, and is part of the upcoming BetaFlight 3.1 RC.

## Hardware Features

### New in V2
* Dedicated UART for RC RX use, no need to solder a jumper to select PPM/SRX anymore.
* Dedicated telemetry UART, this brings the total to 5x plus USB.
* SD Card slot for BlackBox data recording (SD card not included)
* Low noise MPU6000 SPI Gyro.
* USB detection can disable things like buzzer when configuring on the bench.
* New ultra low noise regulators for MCU and IMU power systems.

### Original
* USB Conflict resolution - Hardware inversion, SBUS or telemetry can be used on any of the 3 available hardware serial ports. USB will not interfere with peripherals.
* High Speed SPI 8kHz Gyro
* MPU interrupt connected to F3, allowing the F3 to know immediately when fresh data is available.
* Dedicated Boot button for easy firmware flashing.
* Reinforced solder pads for trouble-free direct soldering.
* Extremely low profile design.
* Recessed, sideways pin headers. Also enables soldering of all wires directly to pads without use of any pin headers.
* Integrated FRSky RSSI Filter (RC filter).
* Input voltage 6v to 24v. Power the board directly from flight pack up to 6S (on 'BAT' pad only!).
* VIN + VBAT merged - A single wire to power the board will provide voltage input and Telemetry/OSD voltage data.
* Filtered voltage output - output 5v 1A (and 3.3v where applicable) to power peripherals such as GPS, RX, BLACKBOX, OSD. 5v/3.3v RX selectable.
* Note: RX pad is dedicated to UART 4 in the Configurator.

## Software/Hardware Features

* Betaflight support (Supports new DSHOT protocol)
* Cleanflight support (RACE target).
* BLHeli passthrough flashing supported by hardware
* Raceflight ready

## Specifications

* STM32F303RCT6(256kB flash) 32-bit processor
* MPU6000 SPI Gyro/Accelerometer
* Micro SD memory card slot (SD card not included)
* High quality, gold plated PCB
* Highest quality components, individually sourced to meet Lumenier standards
* Micro USB connector for programming
* Dimensions: 36x36x6mm (includes USB in height)
* Mounting Holes: 30.5mm square to center of holes
* Weight: 5g
