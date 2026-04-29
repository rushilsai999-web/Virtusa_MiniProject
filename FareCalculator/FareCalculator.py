rates = {1: ("Economy", 10), 2: ("Premium", 18), 3: ("SUV", 25)}

def calculate_fare(distance, choice, time):
    if choice not in rates:
        return None
    
    name, price = rates[choice]
    amount = distance * price
    
    if 17 <= time <= 20:
        surge = 1.5
    else:
        surge = 1
    
    amount = amount * surge
    
    return name, amount

try:
    km = float(input("Enter distance in km: "))
    print("Select Vehicle Type:")
    print("1. Economy")
    print("2. Premium")
    print("3. SUV")
    
    option = int(input("Enter choice (1-3): "))
    hour = int(input("Enter hour (0-23): "))
    
    if hour < 0 or hour > 23:
        print("Invalid hour, please enter between 0 and 23")
    else:
        result = calculate_fare(km, option, hour)
        
        if result is None:
            print("Service Not Available")
        else:
            v_name, total = result
            print("\n------ Ride Receipt ------")
            print("Distance:", km, "km")
            print("Vehicle:", v_name)
            print("Time:", hour)
            print("Surge Applied:", "1.5x" if 17 <= hour <= 20 else "1x")
            print("Total Fare: ₹", round(total, 2))
            print("--------------------------")

except:
    print("Invalid input")