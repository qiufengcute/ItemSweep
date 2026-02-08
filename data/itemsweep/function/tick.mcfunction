# 将清理倒计时减少1
scoreboard players operation @a SweepAfter -= @a ONETICK

# 通知清理掉落物剩余时间
execute if score @p SweepAfter = @p TICK60 run tellraw @a {"text":"[Item Sweep] 还有 60 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p TICK30 run tellraw @a {"text":"[Item Sweep] 还有 30 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p TICK10 run tellraw @a {"text":"[Item Sweep] 还有 10 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p TICK5 run tellraw @a {"text":"[Item Sweep] 还有 5 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p TICK3 run tellraw @a {"text":"[Item Sweep] 还有 3 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p TICK2 run tellraw @a {"text":"[Item Sweep] 还有 2 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p TICK1 run tellraw @a {"text":"[Item Sweep] 还有 1 秒清理掉落物!",color:"red"}
execute if score @p SweepAfter = @p NOTICK run function itemsweep:sweep
