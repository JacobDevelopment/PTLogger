* This is a todolist that will contain all the items that need to be finalized.
* All finished items will be denoted with a date (time is not necessary).
* All finished items will be denoted with a signature (online or IRL).

###Database Login Dialog (gui/dialog/DatabaseLoginDialog.java)
- [ ] Handle remember me checkbox (DatabaseLoginDialog.java)
  - [ ] Create the file reader that can handle the saving (config.json?)
- [ ] Handle information via input (valid, invalid, etc.) (DatabaseLoginDialog.java)
  - [ ] The DB URL and DB Username should handle regex. Password is any character AFAIK.
- [ ] Handle the event that happens when the connect button is pressed.
  - All fields should be inputted (not empty), otherwise the button will not be enabled?
- It should be noted that the DB URL & DB Username have no direct correlation to admin privileges or the specific logged in trainer. These entities have not been listed nor thoroughly thought out yet.
- [ ] Fix bug where if text is erased (after connect button is enabled), the button will disable.
<hr>