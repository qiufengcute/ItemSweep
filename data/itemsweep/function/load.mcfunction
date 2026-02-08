# INTERVALSWEEP
scoreboard objectives add INTERVALSWEEP dummy
scoreboard players set @a INTERVALSWEEP 120

# SECONDTICK
scoreboard objectives add SECONDTICK dummy
scoreboard players set @a SECONDTICK 20

# NOTICK
scoreboard objectives add NOTICK dummy
scoreboard players set @a NOTICK 0

# ONETICK
scoreboard objectives add ONETICK dummy
scoreboard players set @a ONETICK 1

# TIPTIMES
scoreboard objectives add TICK60 dummy
scoreboard players set @a TICK60 60
scoreboard players operation @a TICK60 *= @a SECONDTICK

scoreboard objectives add TICK30 dummy
scoreboard players set @a TICK30 30
scoreboard players operation @a TICK30 *= @a SECONDTICK

scoreboard objectives add TICK10 dummy
scoreboard players set @a TICK10 10
scoreboard players operation @a TICK10 *= @a SECONDTICK

scoreboard objectives add TICK5 dummy
scoreboard players set @a TICK5 5
scoreboard players operation @a TICK5 *= @a SECONDTICK

scoreboard objectives add TICK3 dummy
scoreboard players set @a TICK3 3
scoreboard players operation @a TICK3 *= @a SECONDTICK

scoreboard objectives add TICK2 dummy
scoreboard players set @a TICK2 2
scoreboard players operation @a TICK2 *= @a SECONDTICK

scoreboard objectives add TICK1 dummy
scoreboard players set @a TICK1 1
scoreboard players operation @a TICK1 *= @a SECONDTICK

# SweepAfter
scoreboard objectives add SweepAfter dummy
scoreboard players operation @a SweepAfter = @a INTERVALSWEEP
scoreboard players operation @a SweepAfter *= @a SECONDTICK

# Tip
tellraw @a [\
    {"text":"[Item Sweep] 可以使用 ",color:"red"},\
    {"text":"/scoreboard players set @a INTERVALSWEEP <秒数>","color":"blue"},\
    {"text":" (点我复制指令)","color":"yellow","click_event":{"action":"copy_to_clipboard","value":"/scoreboard players set @a INTERVALSWEEP <秒数>"}},\
    {"text":" 来修改清除掉落物间隔时间!",color:"red"}\
]
