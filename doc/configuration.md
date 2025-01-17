# Main Configuration File

This is the default main configuration file.

    General:
      # Language file to load. Does not need YML extension!
      Language: lang_en
      # Prevent breaking of logs without the right tool
      Prevent Log Breaking Without Tool: false
      # For the toggling command, should players start with TreeAssist active?
      Toggle Default: true
      # Should we check if players have permissions? If false, all features are available to everyone.
      Use Permissions: false
      # Should we announce information about every tree config we load?
      Verbose Config Loading: true
    # === [ Command Settings ] ===
    Commands:
      Force Break:
        Default Radius: 10
        Max Radius: 30
      Force Grow:
        Default Radius: 10
        Max Radius: 30
      No Replant:
        Cooldown Time: 30
    # === [ Automatic Destruction Settings ] ===
    Destruction:
      # Spawn a FallingBlock when breaking a block
      Falling Blocks: false
      # Make the FallingBlocks look almost like an actual tree falling over
      Falling Blocks Fancy: false
      # Increase leaf decay by looking for nearby lonely leaves
      Fast Leaf Decay: true
      # Only break blocks that are above the block the player broke
      Only Above: false
    # === [ Placed Blocks Settings ] ===
    Placed Blocks:
      # Check for player placed blocks
      Active: true
      # A plugin that will look for placed blocks (Prism, LogBlock, CoreProtect)
      Plugin Name: TreeAssist
      # How many seconds back we want to look
      Lookup Time: 86400
    # === [ Plugin Integration Settings ] ===
    Plugins:
      # Count broken blocks towards the TreeFeller ability
      mcMMO: true
      # Count broken trees towards the TreeFeller ability
      TreeMcMMO: false
      # Count broken blocks towards Jobs jobs that fit
      Jobs: true
      # Count broken trees towards Jobs jobs that fit
      TreeJobs: false
      # Allow to set up regions with WorldGuard to prevent destruction with 'treeassist-autochop' and sapling replacement with 'treeassist-replant'
      WorldGuard: false
    # === [ World Related Settings ] ===
    Worlds:
      # Enable world based restrictions
      Restrict: false
      # Worlds that are not restricted
      Enabled Worlds:
      - world
      - world2
    Modding:
      # This is for hacky mods that use infinity durability
      Disable Durability Fix: false
    Debug: none
    # === [ bStats Metrics Settings ] ===
    bStats:
      # Should we send stats at all? Please keep this in so we have an overview of spread of versions <3
      Active: true
      # This setting sends a bit more detailed information about which features are used at all. Thank you for supporting me!
      Full: true
    # === [ Updater Settings ] ===
    Update:
      # what to do? Valid values: disable, announce, download, both
      Mode: both
      # which type of branch to get updates? Valid values: dev, alpha, beta, release
      Type: beta
    # The config version for update checks
    Version: 7.2015