# Use Cases

## Kitchen Cooking Engine – Use Case Document

This document captures real-world use cases derived from project discussions. Each use case represents a scenario the system should support.

---

## Use Case 1: Dinner Party with Helper Timeline

### Scenario
User wants to host a seafood dinner for 6 people. Friends are coming over and can help.

### User Input
> "You know my current ingredients. I want to have a nice seafood dinner for me and 5 friends. They can shop a few things on the way here. I have 2h of prep time and they can help me cooking for 1h when they arrive. Give me 3 recipes based on my gear and stuff that we can make and let me pick."

### Expected System Response
1. Analyze available inventory (biased toward using what's on hand)
2. Check available kitchen gear
3. Suggest 3 menu options matching constraints
4. For each option, show:
   - Solo prep tasks (2h window)
   - Helper tasks (1h window)
   - Shopping list for friends to bring
   - Equipment needed
   - Serving timeline

### Post-Selection
- Generate step-by-step prep instructions
- Create todo-list in Lovelace
- Send shopping list to friends (if needed)
- Coordinate temperature probe monitoring for proteins

---

## Use Case 2: "What Can I Make Tonight?"

### Scenario
User comes home tired and wants dinner inspiration based on what's available.

### User Input
> "What can I make tonight with what I have?"

### Expected System Response
1. Review current inventory (not strict filtering)
2. **Generate creative ideas** that use available ingredients
3. Bias toward recipes that help use up items
4. Suggest 3-5 options ranging from quick to more involved
5. Show what's missing (if anything) for each option

### Design Note
This is **inspiration, not strict matching**. The system should suggest creative combinations even if inventory is incomplete.

---

## Use Case 3: Temperature-Monitored Roast

### Scenario
User is cooking a beef roast and wants MEATER app-like functionality.

### User Input
1. Select protein: Beef → Roast → Prime Rib
2. Select doneness: Medium-Rare
3. Select cooking method: Oven roasting

### Expected System Response
1. Set target internal temperature (54°C / 130°F for medium-rare beef)
2. Monitor tip + ambient temperatures via MEATER+ probe
3. Calculate dynamic ETA based on temperature curve
4. Predict resting phase (carryover cooking)
5. Send notifications:
   - "30 minutes remaining"
   - "Remove from oven now"
   - "Rest complete, ready to serve"

---

## Use Case 4: Grocery Intake from Shopping Trip

### Scenario
User returns from grocery shopping and wants to update inventory.

### User Input
1. Photo of receipt
2. One photo of all groceries on kitchen table

### Expected System Response
1. OCR extracts items, quantities, prices from receipt
2. AI identifies items in photo and **matches them to receipt**
3. Cross-reference for verification
4. Auto-add verified items to inventory (Grocy)
5. Mark items as purchased from shopping list
6. (Optional) Print labels with expiry dates

### Design Note
**No barcode scanning required.** Two photos only.

---

## Use Case 5: Cook Session with Ingredient Deduction

### Scenario
User completes cooking a recipe and wants ingredients automatically updated.

### Trigger
User marks cook session as "complete" in Lovelace

### Expected System Response
1. Deduct used ingredients from inventory
2. Handle partial usage (e.g., "used half the onions")
3. Log cook to history
4. Link recipe to cook session
5. (Optional) User can rate/review the cook

---

## Use Case 6: Expiring Ingredient Alert

### Scenario
Items in inventory are approaching expiry.

### Trigger
System detects items expiring within 3 days

### Expected System Response
1. Send notification: "Salmon expires in 2 days"
2. **Suggest recipes that use expiring items first**
3. Bias AI meal planning toward these ingredients
4. If item expires: auto-remove from inventory, log as waste

---

## Use Case 7: Fish Fillet with Specific Cut

### Scenario
User is cooking salmon and wants precise temperature guidance.

### User Input
1. Select protein: Fish → Salmon → Fillet
2. Select doneness: Medium (still slightly translucent center)
3. Select method: Pan sear

### Expected System Response
1. Set target: 52°C / 125°F (salmon medium)
2. Provide cooking guidance for pan searing fish
3. Account for thin cut (faster cooking)
4. Alert when target reached

### Design Note
Different fish species and cuts have **very different** temperature targets. System must support:
- Salmon, Tuna, Cod, Halibut, Bass, Swordfish
- Fillets, steaks, whole fish

---

## Use Case 8: Pulled Pork with Extended Cook Time

### Scenario
User wants to make pulled pork (long slow cook).

### User Input
1. Select protein: Pork → Shoulder
2. Select doneness: Pulled/Braised
3. Select method: Slow cooker

### Expected System Response
1. Set target: 93°C / 200°F (pulled pork)
2. Estimate 8-12 hour cook time
3. Monitor temperature curve over extended period
4. Send periodic check-in notifications
5. Alert when target reached and meat is probe-tender

---

## Use Case 9: Multi-Course Meal Coordination

### Scenario
User is preparing a 3-course dinner and needs timing coordination.

### User Input
> "I'm making appetizers, main course (roast chicken), and dessert for dinner at 7pm"

### Expected System Response
1. Work backward from 7pm serving time
2. Create timeline:
   - Dessert prep (if make-ahead): 2pm
   - Chicken in oven: 5pm
   - Appetizer prep: 6pm
   - Chicken rest: 6:45pm
   - Appetizers served: 6:30pm
   - Main course served: 7pm
3. Coordinate probe monitoring for chicken
4. Send timeline notifications

---

## Use Case 10: Progressive Gear/Inventory Improvement

### Scenario
New user starts with minimal setup and system improves over time.

### Phase 1: First Use
- User has no inventory data
- System asks: "What proteins do you usually have?"
- User mentions "chicken, beef, fish"
- System suggests common items to add

### Phase 2: After First Cook
- User completes a chicken recipe
- System learns: "User has chicken breast"
- Inventory starts building organically

### Phase 3: After Grocery Photo
- User adds groceries via receipt + photo
- Inventory becomes more complete
- Suggestions become more personalized

### Design Note
**Inventory is progressively improved, never enforced.** System works with incomplete data from day one.

---

## Use Case 11: Vegetable Roasting with Ambient Monitoring

### Scenario
User is roasting vegetables and needs oven temperature monitoring.

### User Input
1. Select: Vegetables → Root vegetables
2. Select method: Oven roasting at 200°C / 400°F

### Expected System Response
1. Use ambient sensor to monitor oven temperature
2. Alert if oven temp drops (door opened too long)
3. Timer-based completion (no internal temp for vegetables)
4. Suggest when to add different vegetables (carrots first, then softer veggies)

---

## Use Case 12: Recipe Database Integration

### Scenario
User finds a recipe online and wants to add it to the system.

### User Input
1. Paste recipe URL into Mealie
2. Mealie imports recipe (ingredients, steps, images)

### Expected System Response
1. Recipe added to database with metadata
2. System can now suggest this recipe based on inventory
3. When recipe is cooked:
   - Show step-by-step in Lovelace
   - Deduct ingredients from inventory
   - Log to cook history

---

## Summary Table

| Use Case | Key Feature | Phase |
|----------|-------------|-------|
| 1. Dinner Party | Multi-phase timeline, helper coordination | 1 |
| 2. What Can I Make? | Inspiration-based suggestions | 1 |
| 3. Roast Monitoring | Temperature + ETA + resting | 1 |
| 4. Grocery Intake | Receipt + photo, no barcodes | 2 |
| 5. Ingredient Deduction | Auto-deduct on cook complete | 1 |
| 6. Expiring Alert | Suggest recipes for expiring items | 1 |
| 7. Fish Fillet | Specific cuts + temps | 1 |
| 8. Pulled Pork | Extended cook monitoring | 1 |
| 9. Multi-Course | Timeline coordination | 1 |
| 10. Progressive Setup | Inventory improves over time | 1 |
| 11. Vegetable Roasting | Ambient monitoring + timers | 1 |
| 12. Recipe Import | Mealie integration | 1 |

---

## Document History

| Version | Date | Changes |
|---------|------|---------|
| 1.0 | 2025-11-30 | Initial use cases from project discussions |
