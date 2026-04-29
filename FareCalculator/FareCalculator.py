rates = {1: ("Economy", 10), 2: ("Premium", 18), 3: ("SUV", 25)}

def calculate_fare(distance, choice, time):
    if choice not in rates:
        return None
    
    name, price = rates[choice]
    base = distance * price
    
    total_surge = 0
    
    for h in range(1, time + 1):
        if 17 <= h <= 20:
            total_surge += 1.5
        else:
            total_surge += 1
    
    final_amount = base * total_surge
    
    return name, final_amount, total_surge

try:
    km = float(input("Enter distance in km: "))
    print("Select Vehicle Type:")
    print("1. Economy")
    print("2. Premium")
    print("3. SUV")
    
    option = int(input("Enter choice (1-3): "))
    hour = int(input("Enter hour (1-23): "))
    
    if hour < 1 or hour > 23:
        print("Invalid hour")
    else:
        result = calculate_fare(km, option, hour)
        
        if result is None:
            print("Service Not Available")
        else:
            v_name, total, surge = result
            print("\n------ Ride Receipt ------")
            print("Distance:", km, "km")
            print("Vehicle:", v_name)
            print("Time:", hour)
            print("Total Surge Units:", surge)
            print("Total Fare: ₹", round(total, 2))
            print("--------------------------")

except:
    print("Invalid input")
