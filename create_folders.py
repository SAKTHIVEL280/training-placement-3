import os

# Create folders
folders = [
    "20-12-25", "21-12-25", "22-12-25", "23-12-25", "24-12-25", 
    "25-12-25", "26-12-25", "27-12-25", "28-12-25", "29-12-25", 
    "30-12-25", "31-12-25", "01-01-26", "02-01-26", "03-01-26"
]

base_path = r"D:\training-placement-3"

for folder in folders:
    folder_path = os.path.join(base_path, folder)
    os.makedirs(folder_path, exist_ok=True)
    print(f"Created: {folder}")

print("\nAll folders created successfully!")
