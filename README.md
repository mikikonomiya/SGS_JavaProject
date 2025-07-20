# SGS_JavaProject
# Social Game System: Cellular Interaction Simulator

A Java console application that models a simple ecosystem of **Bacteria**, **Human Cells**, and **White Blood Cells**. 
Each entity ages, interacts, reproduces, and dies according to configurable rules and relationships.



## Overview
This project implements a turn‑based simulation of three “character” types that behave and interact according to age‑ and type‑based rules:

- **Bacteria** – aggressive reproducers whose poison peaks at mid‑age  
- **Human Cells** – passive reproducers that split after maturity  
- **White Blood Cells** – defenders that proliferate in response to bacteria  

Entities exchange “messages” (damage or healing), reproduce when conditions are met, and die from old age or loss of hit points (HP). The simulation runs for a user‑specified number of loops (turns) and supports dynamic additions mid‑game.


## Features
- **Custom initial population**: Specify starting counts for each cell type.  
- **Turn‑based simulation**: Advance one loop at a time or in batches.  
- **Age & HP management**: Tracks life spans, kills off aged or injured cells.  
- **Reproduction rules**: Each type reproduces under its own age/HP thresholds.  
- **Interaction matrix**: Damage/healing calculated via a relationship grid and age modifier.  
- **Live statistics**: View counts of living and total (spawned) entities at any point.  
