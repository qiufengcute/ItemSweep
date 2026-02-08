# Item Sweep Monorepo

![License](https://img.shields.io/badge/License-MIT-green.svg)
![Minecraft Version](https://img.shields.io/badge/Minecraft-1.13%2B-blue)
[![Modrinth Downloads](https://img.shields.io/modrinth/dt/item-sweep?color=00AF5C&label=Modrinth&logo=modrinth)](https://modrinth.com/mod/item-sweep)
![Mod Loader](https://img.shields.io/badge/loader-Fabric&Datapack-1976d2)

> Source code monorepo for the **Item Sweep** project, an automatic item clearing utility for Minecraft, available as both a Fabric mod and a vanilla datapack.

## 🧭 Branch Navigation

This repository uses separate branches for different implementations of the same core functionality.

| Branch | Loader | Description |
| :--- | :--- | :--- |
| [`fabric`](https://github.com/qiufengcute/ItemSweep/tree/fabric) | **Fabric Mod** | Full-featured version with in-game configuration via gamerules. |
| [`datapack`](https://github.com/qiufengcute/ItemSweep/tree/datapack) | **Vanilla Datapack** | Pure command-based version, requires no mod loader. |

## 🚀 Download (For End Users)
**The recommended way to get Item Sweep is from its Modrinth page, which hosts both versions in one project:**
🔗 [**Item Sweep on Modrinth**](https://modrinth.com/mod/item-sweep)

## ⚠️ Contribution Guidelines

### Special Note for the `fabric` branch
The Fabric mod is **created and maintained using [MCreator](https://mcreator.net/)**.
*   **Hard Rule for PRs**: **Do NOT submit raw `.java` source files.** You must submit changes as **MCreator project files** or a complete exported project. PRs containing only Java source will not be merged.
*   **Advice**: Please open an Issue first to discuss any major changes.

### For the `datapack` branch
Contributions to optimize or fix the vanilla command logic are welcome.

## 📄 License
This project is open-sourced under the **[MIT License](LICENSE)**.
