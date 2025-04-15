from PIL import Image

imagenes = ["fotos/1.jpg", "fotos/2.jpg"]
imagenes_rgb = []

for img_path in imagenes:
    img = Image.open(img_path)
    if img.mode == "RGBA":
        img = img.convert("RGB")
    imagenes_rgb.append(img)

# Guardar todas las imágenes en un solo PDF
imagenes_rgb[0].save("salida.pdf", save_all=True, append_images=imagenes_rgb[1:])
