# 清理掉落物
kill @e[type=item]

# 清理完成
tellraw @a {"text":"[Item Sweep] 掉落物清理完成!",color:"#09f0e5"}

scoreboard players operation @a SweepAfter = @a INTERVALSWEEP
scoreboard players operation @a SweepAfter *= @a SECONDTICK
