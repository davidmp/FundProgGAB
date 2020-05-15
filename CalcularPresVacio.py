lugar=input("Ingrese el Lugar en donde sesea pasar Vacaciones:")
totalKilometro=0
costoxK=float(input("Ingrese el costo por Kilometro:"))
if lugar.upper()=="ME":
  totalKilometro=2*750
elif lugar.upper()=="PV":
  totalKilometro=2*800
elif lugar.upper()=="AC":
  totalKilometro=2*1200
elif lugar.upper()=="CA":
  totalKilometro=2*1800
else:
  totalKilometro=2*0
  print("Se queda en casa!")
costoTotal=totalKilometro*costoxK
print("El costo total de sus vaciones sera: ", costoTotal)
print("Pasara sus vaciones en: ", lugar)