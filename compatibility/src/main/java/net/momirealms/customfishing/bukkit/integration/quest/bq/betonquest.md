# BetonQuest 3.0

requires CustomFishing 2.3.19+ & BetonQuest 3.0-DEV+

```yaml
objective:
  <objective name>: customfish_catch_group <fish group name> <amount to be catched>
  <objective name>: customfish_catch_fish <fish_id> <amount to be catched>
```

Example:

```yaml
objectives:
  catchPoundFish: "customfish_catch_group pound 5"
```

This mean that you have to catch 5 fish in a "pound" group

```yaml
objectives:
  catchTunaFish: "customfish_catch_fish tuna_fish 3"
```

This mean that you have to catch 3 "tuna\_fish"

# message
input yourServer/plugins/BetonQuest/lang/.yml

```yaml
customfish:
  catch_fish: "@[legacy]&2{amount} fish left to catch"
  catch_group: "@[legacy]&2{amount} fish from the group left"
```

(Thanks  @Rastart\_ for providing the example)
