package net.mcreator.test.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.mcreator.test.MushokuMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class ScrollInscribtionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ScrollInscribtion!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				MushokuMod.LOGGER.warn("Failed to load dependency guistate for procedure ScrollInscribtion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Fireball")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Waterball")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Ice Smash")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Water Arrow")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Ice Blade")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Rock Bullet")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Earth Blade")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Dig")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Blast")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Push")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Healing")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Ice Pillar")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Water Cannon")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Icicle Lance")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Stone Cannon")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Earth Pillar")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Explosion")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Flamethrower")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Earth Lance")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("X Healing")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Feast")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Blizzard Storm")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Squall")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Ice Fortress")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Earth Wall")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Earth Hedgehog")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Shine Healing")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Fall Negation")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Cumulonimbus")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Sandstorm")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Violent Storm")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Lightning Strike")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Absolute Zero")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Electric")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Mountain")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Earth Drill")) {
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ScrollInscribtion");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText())));
		}
	}
}
