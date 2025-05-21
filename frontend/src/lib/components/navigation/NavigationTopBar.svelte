<script lang="ts">
	interface NavigationProps {
		href: string;
		icon: string;
		label: string;
		open: boolean;
	}

	interface NavigationTopBarProps {
		Navigation: NavigationProps[];
	}
	const { Navigation }: NavigationTopBarProps = $props();
</script>
