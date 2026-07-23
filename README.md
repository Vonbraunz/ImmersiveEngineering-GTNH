![Logo](https://raw.githubusercontent.com/BluSunrize/ImmersiveEngineering/1.7.10/src/main/resources/assets/immersiveengineering/logo.png)

# Immersive Engineering — 1.7.10 GTNH

A native 1.7.10 port of [Immersive Engineering](https://github.com/BluSunrize/ImmersiveEngineering) built for the [GT New Horizons](https://www.gtnewhorizons.com/) modpack. Rebuilt from scratch against the 1.7.10 Forge API using the GTNH RetroFuturaGradle build system.

### What's included
The full IE suite: the wire power network (LV/MV/HV connectors, transformers, capacitors), multiblock processing machines (crusher, squeezer, fermenter, refinery, diesel generator, excavator, arc furnace, assembler, bottling machine, metal press, sheetmetal tank, silo, coke oven, blast furnace), the engineer's manual, cosmetic shaders, chemthrower, railgun, revolver, skyhook, and all structural/decoration blocks.

### Building
- **JDK 25+** required (RetroFuturaGradle v2 targets Java 25 for build tooling; compiled output is Java 8 bytecode via Jabel)
- `./gradlew :runClient` — dev client
- `./gradlew :build` — production jar

### Credits
- [BluSunrize](https://github.com/BluSunrize) and the Immersive Engineering contributors — original mod
- [GT New Horizons](https://github.com/GTNewHorizons) — build system and ecosystem
