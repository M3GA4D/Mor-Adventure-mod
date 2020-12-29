// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer root;
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 24.0F, 0.0F);

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(waist);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		waist.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 15, -4.0F, -24.0F, -5.0F, 8,
				12, 6, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(2.0F, -22.0F, 0.0F);
		body.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -7.0F, -9.0F, -6.0F, 10, 7,
				8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 12, -5.0F, -4.0F, -7.0F, 6, 2,
				1, 0.0F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-4.0F, -23.0F, -1.0F);
		body.addChild(rightArm);
		rightArm.cubeList.add(new ModelBox(rightArm, 37, 41, -5.0F, -1.0F,
				-2.0F, 5, 13, 4, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(4.0F, -23.0F, -1.0F);
		body.addChild(leftArm);
		leftArm.cubeList.add(new ModelBox(leftArm, 0, 33, 0.0F, -1.0F, -2.0F,
				5, 13, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.0F, -9.0F, -1.0F);
		root.addChild(rightleg);
		rightleg.cubeList.add(new ModelBox(rightleg, 31, 10, -2.7F, -3.0F,
				-3.0F, 4, 12, 5, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.0F, -9.0F, -1.0F);
		root.addChild(leftleg);
		leftleg.cubeList.add(new ModelBox(leftleg, 23, 28, -2.7F, -3.0F, -3.0F,
				4, 12, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		root.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F
				+ (float) Math.PI)
				* f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}